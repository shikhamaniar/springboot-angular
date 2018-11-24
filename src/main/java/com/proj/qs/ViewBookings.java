package com.proj.qs;

import org.springframework.stereotype.Component;

@Component
public class ViewBookings {

	private Iterable<Customer> c;
	private Iterable<Services> s;
	private Iterable<Appointment> a;
	private Iterable<ServicesBooked> sbd;
	
	public Iterable<Customer> getC() {
		return c;
	}
	public void setC(Iterable<Customer> c) {
		this.c = c;
	}
	public Iterable<Services> getS() {
		return s;
	}
	public void setS(Iterable<Services> s) {
		this.s = s;
	}
	public Iterable<Appointment> getA() {
		return a;
	}
	public void setA(Iterable<Appointment> a) {
		this.a = a;
	}
	public Iterable<ServicesBooked> getSbd() {
		return sbd;
	}
	public void setSbd(Iterable<ServicesBooked> sbd) {
		this.sbd = sbd;
	}
	
	
}
