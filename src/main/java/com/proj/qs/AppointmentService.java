package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository repo;
	
	public void addappointment(Appointment appointment) {
		// TODO Auto-generated method stub
	    this.repo.save(appointment);
	}

	public void deleteappointment(int id) {
		
		this.repo.deleteById(id);

	}

	public List<Appointment> getallappointment() {
		//return names;
		
				List<Appointment> appointment = new ArrayList<>();
				repo.findAll().forEach(appointment::add);
				
				return appointment;
	}

}
