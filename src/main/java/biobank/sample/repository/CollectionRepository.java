package biobank.sample.repository;

import org.springframework.data.repository.CrudRepository;

import biobank.sample.domain.Collection;

public interface CollectionRepository extends CrudRepository<Collection, Integer>{

}
