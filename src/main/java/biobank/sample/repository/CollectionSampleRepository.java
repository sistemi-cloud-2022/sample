package biobank.sample.repository;

import org.springframework.data.repository.CrudRepository;

import biobank.sample.domain.CollectionSample;

public interface CollectionSampleRepository extends CrudRepository<CollectionSample, Integer> {

}
