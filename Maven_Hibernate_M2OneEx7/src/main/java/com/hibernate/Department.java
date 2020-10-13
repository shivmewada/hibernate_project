package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detartment_tbl")
public class Department {
	@Id
	@GeneratedValue
	@Column(name = "dep_id")
	private int id;

	@Column(name = "dep_name")
	private String name;

	@Column(name = "dep_site")
	private String site;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String name, String site) {
		super();
		this.name = name;
		this.site = site;
	}

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

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	 
		
}
