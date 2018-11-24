package com.proj.qs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "servicetype")
public class ServiceType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int typeid;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "st", cascade = CascadeType.ALL)
	private List<Services> s ;
	
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Services> getS() {
		return s;
	}

	public void setS(List<Services> s) {
		this.s = s;
	}

	public ServiceType(Integer typeid, String name, List<Services> s) {
		super();
		this.typeid = typeid;
		this.name = name;
		this.s = s;
	}

	@Override
	public String toString() {
		return "ServiceType [typeid=" + typeid + ", name=" + name + ", s=" + s + "]";
	}

	public ServiceType() {
		super();
	}


}
