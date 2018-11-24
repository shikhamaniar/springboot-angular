package com.proj.qs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> , JpaRepository<User, Integer> {
    User findByEmail(String email);
    
}