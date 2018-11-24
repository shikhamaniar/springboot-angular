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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sevicebookedd")
public class ServicesBooked {

	@Column(name = "sbid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sbid;

	// @ManyToOne(fetch=FetchType.LAZY)
	@Column(name = "appid")
	private Integer ap;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="serviceid")
	private Services s;
	
	public Services getS() {
		return s;
	}

	public void setS(Services s) {
		this.s = s;
	}

	public ServicesBooked() {

	}

	public int getSbid() {
		return sbid;
	}

	public void setSbid(int sbid) {
		this.sbid = sbid;
	}

	public Integer getAp() {
		return ap;
	}

	public void setAp(Integer ap) {
		this.ap = ap;
	}

}
