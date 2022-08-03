package biobank.sample.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import biobank.sample.service.SampleService;
import biobank.sample.domain.Sample;

@RestController
@RequestMapping("/sample/samples")
public class SampleController {

	@Autowired
	SampleService sampleService;

	// @Value("${app.userService}")
	// String userServicePath;

	// FIXME: Non funziona
	@Value("${app.shipment}")
	String shipmentServicePath = "http://localhost:9091";

	@Value("${app.biobank}")
	String biobankServicePath = "http://localhost:9093";

	@Value("${app.donor}")
	String donorServicePath = "http://localhost:9095";

	@Autowired
	RestTemplate restTemplate;

	// FIRST USE CASE
	@PostMapping("")
	public ResponseEntity<String> createSample(@Valid @RequestBody Sample newSample) {

		ResponseEntity<String> response;
		String endpoint = "";
		Integer box_id = newSample.getBoxId();
		String location_id = newSample.getLocationId();
		Integer donor_id = newSample.getDonorId();
		Integer consent_id = newSample.getConsentId();


		System.out.println(shipmentServicePath);
		System.out.println(biobankServicePath);
		System.out.println(donorServicePath);


		try {
			if (box_id != null) {
				System.out.println("PASSO 1");
				endpoint = shipmentServicePath + "/shipment/shipmentsBoxes/" + String.valueOf(box_id);
				response = restTemplate.getForEntity(endpoint, String.class);
				System.out.println(response);
			}
			if (location_id != null) {
				endpoint = biobankServicePath + "/biobank/freezers/" + location_id;
				response = restTemplate.getForEntity(endpoint, String.class);
			}
			if (donor_id != null) {
				endpoint = donorServicePath + "/donor/donors/" + String.valueOf(donor_id);
				response = restTemplate.getForEntity(endpoint, String.class);
			}
			if (consent_id != null) {
				endpoint = donorServicePath + "/donor/consents/" + String.valueOf(consent_id);
				response = restTemplate.getForEntity(endpoint, String.class);
			}
			sampleService.createSample(newSample);
		} catch (final HttpClientErrorException e) {
			System.out.println(e.getStatusCode());
			System.out.println(e.getResponseBodyAsString());
			return ResponseEntity.status(e.getStatusCode()).build();
		}

		sampleService.createSample(newSample);
		return ResponseEntity.ok().body("Sample Created");
	}

	@PutMapping("/{id}")
	public @ResponseBody Sample updateSample (@PathVariable Integer id, @RequestParam Integer boxId) {
		return sampleService.updateSample(id, boxId);
	}

	@GetMapping("")
	public @ResponseBody List<Sample> getAllSamples() {
		return sampleService.getAllSamples();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Sample> getSample(@PathVariable Integer id) {
		Optional<Sample> sample = sampleService.getSample(id);
		if (sample.isPresent())
			return ResponseEntity.ok().body(sample.get());
		return ResponseEntity.notFound().build();
	}

	// @GetMapping("/{id}/user")
	// public ResponseEntity<String> getSampleUser(@PathVariable Integer id) {
	// 	String endpoint = "";
	// 	Optional<Sample> sample = sampleService.getSample(id);
	// 	if (sample.isPresent()) {
	// 		endpoint = userServicePath + "/users/" + String.valueOf(sample.get().getUserId());
	// 		return restTemplate.getForEntity(endpoint, String.class);
	// 	}
	// 	return ResponseEntity.notFound().build();
	// }

}
