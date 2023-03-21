package org.moussaud.micropets.pets;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AIPetsController {

	@Autowired
	AIPetsRepository repository;

	@GetMapping(value = "/liveness")
	public String liveness() {
		return "BirdogsServiceLiveness";
	}

	@GetMapping(value = "/readiness")
	public String readiness() {
		return "BirdogsServiceReadiness";
	}

	@GetMapping(value = { "", "/", "/aipets/v1/data" }, produces = MediaType.APPLICATION_JSON_VALUE)
	public AIPetsSummary aipets() {
		return repository.findAll();
	}

	@GetMapping(value = "/aipets/v1/data/{index}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AIPet aipets(@PathVariable Long index) {
		return repository.findById(index.longValue());
	}

	@GetMapping(value = "/aipets/v1/load", produces = MediaType.APPLICATION_JSON_VALUE)
	public AIPetsSummary load() {
		return repository.generate();
	}

}
