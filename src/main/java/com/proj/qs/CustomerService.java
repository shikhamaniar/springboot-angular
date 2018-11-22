package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;

	public void addcustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.repo.save(customer);
	}

	public List<Customer> getallcustomer() {
		List<Customer> names = new ArrayList<>();
		repo.findAll().forEach(names::add);

		return names;

	}

	public void deletecustomer(int id) {
		this.repo.deleteById(id);

	}

	public void updatecustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.repo.save(customer);
	}

}
