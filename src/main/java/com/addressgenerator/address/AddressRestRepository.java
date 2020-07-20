package com.addressgenerator.address;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AddressRestRepository extends CrudRepository<Address,Long> {

}

