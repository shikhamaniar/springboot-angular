package com.proj.qs;

import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository  extends CrudRepository<Appointment, Integer>{
	//Appointment findByName(String name);
}
