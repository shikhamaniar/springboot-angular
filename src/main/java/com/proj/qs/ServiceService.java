package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {

	@Autowired
	private ServiceRepository repo;

	@Autowired 
	private ServiceTypeRepository serTRepo;
	
	public void addservice(Services service, int id) {
		// TODO Auto-generated method stub
		ServiceType type = serTRepo.findById(id).get();
		service.setSt(type);
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
