package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTypeService {

	@Autowired
	private ServiceTypeRepository repo;


	
	
	public void addservicetype(ServiceType service) {
		// TODO Auto-generated method stub
		this.repo.save(service);
	}
	
	public List<ServiceType> getAllservice() {
		
		List<ServiceType> names = new ArrayList<>();
		repo.findAll().forEach(names::add);
		
		return names;
	
	}

	public void deleteservicetype(int id)
	{
		this.repo.deleteById(id);
	}


	}
	
