package org.moussaud.micropets.pets;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AIPetsController {

	static Logger logger = LoggerFactory.getLogger(AIPetsController.class);

	@Autowired
	AIPetsRepository repository;

	@Autowired
	AIPetsGenerator generator;

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
		AIPetsSummary summary = new AIPetsSummary();
		try {
			if (repository.count() == 0) {
				return this.load();
			} else {
				for (AIPet pet : repository.findAll()) {
					summary.addPet(pet);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return summary.filter();
	}

	@GetMapping(value = "/aipets/v1/data/{index}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AIPet aipets(@PathVariable Long index) {
		return repository.findById(index).get();
	}

	@GetMapping(value = "/aipets/v1/load", produces = MediaType.APPLICATION_JSON_VALUE)
	public AIPetsSummary load() {
		logger.debug("----LOAD....");
		AIPetsSummary summary = generator.generate();
		logger.debug("Save All : Insert in db:" + summary.pets);
		repository.saveAll(summary.pets);
		return summary;
	}

}
