package biobank.sample.repository;

import org.springframework.data.repository.CrudRepository;

import biobank.sample.domain.Sample;

public interface SampleRepository extends CrudRepository<Sample, Integer> {

}
