package com.proj.qs;

import javax.persistence.*;

@Entity
@Table(name = "servicetype")
public class ServiceType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer typeid;
	
	@Column(name = "name")
	private String name;

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

	public ServiceType(Integer typeid, String name) {
		super();
		this.typeid = typeid;
		this.name = name;
	}

	public ServiceType() {
		
	}
	
	
	
	
	}


