package biobank.sample.repository;

import org.springframework.data.repository.CrudRepository;

import biobank.sample.domain.StaticAgeUnit;

public interface StaticAgeUnitRepository extends CrudRepository<StaticAgeUnit, Integer> {

}
