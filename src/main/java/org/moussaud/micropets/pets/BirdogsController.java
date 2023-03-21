package org.moussaud.micropets.pets;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class BirdogsController {

	@Autowired
	BirdogsRepository repository;

	@GetMapping(value = "/liveness")
	public String liveness() {
		return "BirdogsServiceLiveness";
	}

	@GetMapping(value = "/readiness")
	public String readiness() {
		return "BirdogsServiceReadiness";
	}

	@GetMapping(value = { "", "/", "/birdogss/v1/data" }, produces = MediaType.APPLICATION_JSON_VALUE)
	public BirdogsSummary Birdogss() {
		BirdogsSummary summary = new BirdogsSummary();

		for (Birdogs Birdogs : repository.findAll()) {
			summary.addBirdogs(Birdogs);
		}

		return summary;
	}

	@GetMapping(value = "/birdogss/v1/data/{index}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Birdogs Birdogs(@PathVariable Long index) {
		return repository.findById(index.longValue());
	}

	@GetMapping(value = "/birdogss/v1/load", produces = MediaType.APPLICATION_JSON_VALUE)
	public BirdogsSummary load() {
		
		return this.Birdogss();
	}

}