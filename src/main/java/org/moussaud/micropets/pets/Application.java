package org.moussaud.micropets.pets;

import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bindings.Binding;
import org.springframework.cloud.bindings.Bindings;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;

import org.slf4j.Logger;

@SpringBootApplication
public class Application {

	static Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	AIPetsGenerator generator;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public HttpExchangeRepository htttpTraceRepository() {
		return new InMemoryHttpExchangeRepository();
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			logger.debug("Let's inspect the beans provided by Spring Boot:");
			logger.debug("apikey:\t"+ generator.getOpenaiAPIKey());
			logger.debug("items:\t" +generator.getItems());
			logger.debug("prompt:\t"+generator.getOpenaiPrompt());
		};
	}
}
