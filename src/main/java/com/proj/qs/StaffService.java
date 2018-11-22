package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository repo;

	
	public List<Staff> getallstaff() {
		//return names;
		
		List<Staff> staff = new ArrayList<>();
		repo.findAll().forEach(staff::add);
		
		return staff;
	}

	public void addstaff(Staff staff)
	{
        this.repo.save(staff);
	}
	public void deletestaff(int id)
	{
		this.repo.deleteById(id);
	}

	public void updateName(Staff name) {
		// TODO Auto-generated method stub
		this.repo.save(name);

	}


	

}
