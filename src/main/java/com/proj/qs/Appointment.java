package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cid")
    private Customer cid;

	@OneToMany(mappedBy = "ap", cascade = CascadeType.ALL)
	private List<ServicesBooked> sb ;

 
	
	public List<ServicesBooked> getSb() {
		return sb;
	}

	public Customer getCid() {
		return cid;
	}

	public void setCid(Customer cid) {
		this.cid = cid;
	}

	public void setSb(List<ServicesBooked> sb) {
		this.sb = sb;
	}

	
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
