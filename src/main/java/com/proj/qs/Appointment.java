package com.proj.qs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int appid;
	
	@Column(name = "bookingdate")
    String bookingdate;
	
	@Column(name = "bookingondate")
    String bookingondate;
	
	@Column(name = "bookingtime")
    String bookingtime;
	
	@Column(name = "totalamt")
    float totalamt;

     public Appointment() {
        
    }

	public int getAppid() {
		return appid;
	}

	public void setAppid(int appid) {
		this.appid = appid;
	}

	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	public String getBookingondate() {
		return bookingondate;
	}

	public void setBookingondate(String bookingondate) {
		this.bookingondate = bookingondate;
	}

	public String getBookingtime() {
		return bookingtime;
	}

	public void setBookingtime(String bookingtime) {
		this.bookingtime = bookingtime;
	}

	public float getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(float totalamt) {
		this.totalamt = totalamt;
	}

	@Override
	public String toString() {
		return "Appointment [appid=" + appid + ", bookingdate=" + bookingdate + ", bookingondate=" + bookingondate
				+ ", bookingtime=" + bookingtime + ", totalamt=" + totalamt + "]";
	}
	
     
}
