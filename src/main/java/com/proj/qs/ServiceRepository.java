package com.proj.qs;

import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Services, Integer> {

//	@Query(value="select s.serviceid, s.name, st.typeid, st.name from service as s\r\n" + 
//			"join servicetype as st \r\n" + 
//			"on s.typeid=st.typeid")
//	Services viewAllType();
}
