package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_detail")
public class Employee {
   @Id
   @GeneratedValue
   @Column(name="emp_id")
	private int id;
   
   @Column(name="emp_name")
   private String name;
   
   @ManyToOne(cascade = CascadeType.ALL)
   private Department department;

public Employee() {
	super();
	 
}

 

public Employee(String name, Department department) {
	super();
	this.name = name;
	this.department = department;
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

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}
   
}
