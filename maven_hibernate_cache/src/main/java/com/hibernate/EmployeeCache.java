package com.hibernate;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "empcache" )
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY) // only two new annotation are used
public class EmployeeCache {
	@Id
	private int id;

	private String name;

	private float salary;
	

	public EmployeeCache() {
		super();
		 
	}

	public EmployeeCache(int id,String name, float salary) {
		super();
		this.id=id;
		this.name = name;
		this.salary = salary;
		
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
