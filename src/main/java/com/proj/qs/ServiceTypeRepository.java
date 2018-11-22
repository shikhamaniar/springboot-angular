package com.proj.qs;

import org.springframework.data.repository.CrudRepository;

public interface ServiceTypeRepository extends CrudRepository<ServiceType, Integer> {
    ServiceType findByName(String name);
}