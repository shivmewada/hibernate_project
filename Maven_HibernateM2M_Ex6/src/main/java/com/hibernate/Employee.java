package com.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Embeddable
@Entity
@Table(name = "emplyee_detail")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private int id;
	
	@Column(name = "firstname")
	private String fname;
	
	@Column(name = "lastname")
	private String lname;

	@ManyToMany(cascade = CascadeType.ALL)
	
	private Set<Metting> metting =new HashSet<Metting>();

	public Employee() {
		super();
		 
	}

	public Employee(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Set getMetting() {
		return metting;
	}

	public void setMetting(Set metting) {
		this.metting = metting;
	}

}
