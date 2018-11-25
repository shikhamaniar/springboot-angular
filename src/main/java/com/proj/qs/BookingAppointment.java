package com.proj.qs;

import java.util.List;

public class BookingAppointment {

	private String bookingdate;
	private String bookingtime;
	private int cid;
	private String bookingondate;
	private List<ServicesTemp> sb;
	private int totalamt;

	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	public String getBookingtime() {
		return bookingtime;
	}

	public void setBookingtime(String bookingtime) {
		this.bookingtime = bookingtime;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getBookingondate() {
		return bookingondate;
	}

	public void setBookingondate(String bookingondate) {
		this.bookingondate = bookingondate;
	}

	public List<ServicesTemp> getSb() {
		return sb;
	}

	public void setSb(List<ServicesTemp> sb) {
		this.sb = sb;
	}

	public int getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(int totalamt) {
		this.totalamt = totalamt;
	}

}
