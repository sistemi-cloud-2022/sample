package biobank.sample.repository;

import org.springframework.data.repository.CrudRepository;

import biobank.sample.domain.MiabisStorageTemperature;

public interface MiabisStorageTemperatureRepository extends CrudRepository<MiabisStorageTemperature, Integer> {

}
