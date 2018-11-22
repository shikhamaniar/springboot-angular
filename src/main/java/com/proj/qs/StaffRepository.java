package com.proj.qs;

import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Integer>{
	Staff findByName(String name);
}
