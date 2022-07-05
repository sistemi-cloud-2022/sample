package biobank.sample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biobank.sample.domain.Sample;
import biobank.sample.repository.SampleRepository;

@Service
public class SampleService {
	
	@Autowired
	SampleRepository sampleRepository;
	
	public Sample createSample(Sample s) {
		return sampleRepository.save(s);
	}
	
	public Optional<Sample> getSample(Integer id){
		return sampleRepository.findById(id);
	}
	
	public List<Sample> getAllSamples(){
		List<Sample> samples = new ArrayList<>();
		sampleRepository.findAll().forEach(samples::add);
		return samples;
	}
	
	public Sample updateSample (Integer id, Integer boxId) {
		return sampleRepository.findById(id)
				.map(sample -> {
					sample.setBoxId(boxId);
					return sampleRepository.save(sample);
				})
				.orElseThrow();
	}
}
