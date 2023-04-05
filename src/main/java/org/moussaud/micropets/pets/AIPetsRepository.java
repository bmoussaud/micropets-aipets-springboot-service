package org.moussaud.micropets.pets;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Component
public class AIPetsRepository {

    @Value("${openai.apikey:xxxxxxxx}")
    String openaiAPIKey;

    @Value("${k8s.bindings.app-aipets-config.prompt:A cute dog with wings as a bird}")
    String openaiPrompt;

    @Value("${k8s.bindings.app-aipets-config.items:2}")
    int items;

    private final Random random = new Random();
    private AIPetsSummary data = new AIPetsSummary();

    public AIPetsSummary generate() {
        data.clear();
        try {
            List<String> images = generateImages(items);
            List<String> names = generateNames(items);
            List<String> kinds = generateKinds(items);
            for (int i = 0; i < items; i++) {
                data.addBirdogs(new AIPet(i, names.get(i), kinds.get(i), random.nextInt(12), images.get(i)));
            }

        } catch (Exception e) {
            System.out.println("-------");
            System.out.println(e);
            data.addBirdogs(new AIPet(0, e.getClass().getName(), "Kind", random.nextInt(12), "http://error.com/0"));
            data.addBirdogs(new AIPet(1, e.getClass().getName(), "Kind", random.nextInt(12), "http://error.com/1"));
            data.addBirdogs(new AIPet(2, e.getClass().getName(), "Kind", random.nextInt(12), "http://error.com/2"));
            data.addBirdogs(new AIPet(2, e.getClass().getName(), "Kind", random.nextInt(12), "http://error.com/3"));
        }

        return data;
    }

    public AIPetsSummary findAll() {
        if (data.total == 0) {
            return generate();
        } else {
            return data;
        }
    }

    public AIPet findById(long index) {
        return findAll().pets.get((int) index);
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
        request.setSize("1024x1024");
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
        System.out.println(response.getCreatedBy());
        System.out.println(response.getImages().size());
        for (Dalle2Image image : response.getImages()) {
            System.out.println(image);
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
