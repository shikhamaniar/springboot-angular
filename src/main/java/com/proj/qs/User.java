package com.proj.qs;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "contact")
	private int contact;

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public User() {
	}

	public User( String name, String email, String password, int gender, int contact) {
		super();

		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [aid=" + aid + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", contact=" + contact + "]";
	}
}