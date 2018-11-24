package com.proj.qs;

import org.springframework.stereotype.Component;

@Component
public class BookingDisplay {
		

	private Iterable<Customer> c;
	private Iterable<ServiceType> st;
	
	public Iterable<Customer> getC() {
		return c;
	}
	public void setC(Iterable<Customer> c) {
		this.c = c;
	}
	public Iterable<ServiceType> getSt() {
		return st;
	}
	public void setSt(Iterable<ServiceType> st) {
		this.st = st;
	}
	
	
}
