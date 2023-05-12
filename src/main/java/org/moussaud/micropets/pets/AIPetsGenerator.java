package org.moussaud.micropets.pets;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

@Component
public class AIPetsGenerator {

    static Logger logger = LoggerFactory.getLogger(AIPetsGenerator.class);

    @Value("${k8s.bindings.openai.apikey:xxxxxxxx}")
    String openaiAPIKey;

    @Value("${k8s.bindings.app-aipets-config.prompt:A tiny mouse}")
    String openaiPrompt;

    @Value("${k8s.bindings.app-aipets-config.items:2}")
    int items;

    private final Random random = new Random();
    private AIPetsSummary data = new AIPetsSummary();

    public AIPetsSummary generateDummy() {
        data.clear();
        data.addPet(new AIPet(this.getClass().getName(), "Kind", random.nextInt(12), "http://error.com/0"));
        return data;
    }

    public AIPetsSummary generate() {
        data.clear();
        try {
            List<String> images = generateImages(items);
            List<String> names = generateNames(items);
            List<String> kinds = generateKinds(items);
            for (int i = 0; i < items; i++) {
                data.addPet(new AIPet(names.get(i), kinds.get(i), random.nextInt(12), images.get(i)));
            }
            return data;

        } catch (Exception e) {
            logger.error("generation error", e);
            throw new RuntimeException("generation error", e);
        }
    }

    private List<String> generateNames(int i) {
        // https://names.drycodes.com/4?format=json&separator=space&nameOptions=girl_names
        final WebClient client = WebClient.builder()
                .baseUrl("https://names.drycodes.com")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        final String[] names = client.get()
                .uri("/" + i + "?format=json&separator=space&nameOptions=girl_names")
                .retrieve()
                .bodyToMono(String[].class)
                .log()
                .block();

        return List.of(names);
    }

    private List<String> generateKinds(int i) {
        // https://names.drycodes.com/4?format=json&separator=space&nameOptions=girl_names
        final WebClient client = WebClient.builder()
                .baseUrl("https://names.drycodes.com")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        final String[] names = client.get()
                .uri("/" + i + "?format=json&separator=space")
                .retrieve()
                .bodyToMono(String[].class)
                .log()
                .block();

        return List.of(names);
    }

    private List<String> generateImages(int n) {
        WebClient client = WebClient.builder()
                .baseUrl("https://api.openai.com")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + openaiAPIKey)
                .build();

        Dalle2Request request = new Dalle2Request();
        request.setN(n);
        request.setPrompt(openaiPrompt);
        request.setSize("512x512");
        Mono<Dalle2Response> generation = client.post()
                .uri("/v1/images/generations")
                .body(Mono.just(request), Dalle2Request.class)
                .retrieve()
                .onStatus(status -> status.value() == HttpStatus.UNAUTHORIZED.value(),
                        response -> Mono.error(new Dalle2Exception("Unauthorized. Please provide Dalle2 Token.",
                                response.statusCode().value())))
                .bodyToMono(Dalle2Response.class);
        // .map(Dalle2Response::getImages);

        Dalle2Response response = generation.log().block();
        logger.debug("created by " + response.getCreatedBy());
        logger.debug("image size " + response.getImages().size());
        for (Dalle2Image image : response.getImages()) {
            logger.debug(image.toString());
        }
        return response.getImages().stream().map(image -> image.getUrl()).collect(Collectors.toList());

    }

    public String getOpenaiAPIKey() {
        return openaiAPIKey;
    }

    public int getItems() {
        return items;
    }

    public String getOpenaiPrompt() {
        return openaiPrompt;
    }
}
