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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "service")
public class Services {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "serviceid")
	private Integer serviceid;

//	@Column(name = "typeid")
//    int typeid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeid")
	private ServiceType st;

	@Column(name = "name")
	String name;

	@Column(name = "price")
	float price;

	@Column(name = "typedescription")
	String typedescription;
	
	
	//@OneToMany(mappedBy = "serviceid", cascade = CascadeType.ALL)
	//private List<ServicesBooked> sb = new ArrayList<>();
	
	public Services() {

	}

	@JsonIgnore
	public ServiceType getSt() {
		return st;
	}

	public void setSt(ServiceType st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Services [serviceid=" + serviceid + ", st=" + st + ", name=" + name + ", price=" + price
				+ ", typedescription=" + typedescription + "]";
	}


//	public int getTypeid() {
//		return typeid;
//	}
//
//	public void setTypeid(int typeid) {
//		this.typeid = typeid;
//	}

	public Integer getServiceid() {
		return serviceid;
	}

	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getTypedescription() {
		return typedescription;
	}

	public void setTypedescription(String typedescription) {
		this.typedescription = typedescription;
	}

}
