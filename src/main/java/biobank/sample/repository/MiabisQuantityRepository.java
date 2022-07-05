package biobank.sample.repository;

import org.springframework.data.repository.CrudRepository;

import biobank.sample.domain.MiabisQuantity;

public interface MiabisQuantityRepository extends CrudRepository<MiabisQuantity, Integer>{

}
