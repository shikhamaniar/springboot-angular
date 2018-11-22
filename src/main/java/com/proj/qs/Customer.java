package com.proj.qs;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int id;
	
	@Column(name="name")
    String name;
	
	@Column(name = "pincode")
    int pincode;
	
	@Column(name = "house_no")
    String house_no;
	
	@Column(name = "area")
    String area;
	
	@Column(name = "landmark")
    String landmark;
	
	@Column(name = "city")
    String city;
	
	@Column(name = "state")
    String state;
	
	@Column(name = "contact")
    String contact;
	
	@Column(name = "email")
    String email;
	
	@Column(name = "gender")
    String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", pincode=" + pincode + ", house_no=" + house_no + ", area="
				+ area + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", contact=" + contact
				+ ", email=" + email + ", gender=" + gender + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Customer() {
		super();
	}
	
	

	
}