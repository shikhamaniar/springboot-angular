package com.proj.qs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository  extends CrudRepository<Appointment, Integer>,  JpaRepository<Appointment, Integer>{

	//@Query()
	//BookingDisplay viewBooking();
	//Appointment findByName(String name);
	
}
