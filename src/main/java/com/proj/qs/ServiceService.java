package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {

	@Autowired
	private ServiceRepository repo;

	public void addservice(Services service) {
		// TODO Auto-generated method stub
		this.repo.save(service);
	}

	public void deleteservice(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
	}

	public List<Services> getallservice() {

		List<Services> service = new ArrayList<>();
		repo.findAll().forEach(service::add);
		
		return service;

	}

}
