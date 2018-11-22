package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public void tosave(User user1)
	{
        this.repo.save(user1);
	}
	public void todeleteuser(int id)
	{
		this.repo.deleteById(id);
	}

	public List<User> getAll() {
		//return names;
		
		List<User> names = new ArrayList<>();
		repo.findAll().forEach(names::add);
		
		return names;
	}
	public void adduser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	}
	
