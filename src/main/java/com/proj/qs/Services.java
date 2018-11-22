package com.proj.qs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Services {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int serviceid;
	
	@Column(name = "typeid")
    int typeid;
	
	@Column(name = "name")
    String name;
	
	@Column(name = "price")
    float price;
	
	@Column(name = "typedescription")
    String typedescription;

     public Services() {
        
    }
     

	@Override
	public String toString() {
		return "Service [serviceid=" + serviceid + ", typeid=" + typeid + ", name=" + name + ", price=" + price
				+ ", typedescription=" + typedescription + "]";
	}

	public int getServiceid() {
		return serviceid;
	}

	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
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
