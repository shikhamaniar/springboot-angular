package com.proj.qs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository repo;

	@Autowired
	private CustomerRepository custrepo;

	@Autowired
	private ServiceTypeRepository serTRepo;
	
	@Autowired
	private ServicesBookedRepository serBRepo;
	
	@Autowired
	private ServiceRepository serRepo;
	

	public void addappointment(Appointment appointment) {
		// TODO Auto-generated method stub
		this.repo.save(appointment);
	}

	public void deleteappointment(int id) {

		this.repo.deleteById(id);

	}
//
//	public List<Appointment> getallappointment() {
//		//return names;
//		
//				List<Appointment> appointment = new ArrayList<>();
//				repo.findAll().forEach(appointment::add);
//				
//				return appointment;
//	}

	public BookingDisplay viewBooking() {
		BookingDisplay bd = new BookingDisplay();

		bd.setC(custrepo.findAll());
		bd.setSt(serTRepo.findAll());
		return bd;
		// TODO Auto-generated method stub

	}

	public void bookingappointment() {
		// TODO Auto-generated method stub

	}

	public ViewBookings viewAppointment() {
		ViewBookings vb = new ViewBookings();
		

	    vb.setC(custrepo.findAll());
		vb.setS(serRepo.findAll());
		vb.setA(repo.findAll());
		vb.setSbd(serBRepo.findAll());
		// TODO Auto-generated method stub
		return vb;
	}

	public ViewBookings deletebookedappointment() {
		// TODO Auto-generated method stub
		return null;
	}

//	public void bookAppointment(Appointment appointment) {
//		// TODO Auto-generated method stub
//		
//	}

}
