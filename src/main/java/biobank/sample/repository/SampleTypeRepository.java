package biobank.sample.repository;

import org.springframework.data.repository.CrudRepository;

import biobank.sample.domain.SampleType;

public interface SampleTypeRepository extends CrudRepository<SampleType, Integer> {

}
