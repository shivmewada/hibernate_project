package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee")
public class Employee {
	@Id
   private int eid;
   private String name;
   private String city;
   private int salary;
public Employee(int eid, String name, String city, int salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.city = city;
	this.salary = salary;
}
public Employee() {
	super();
	 
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return this.eid+":"+this.name+":"+this.city+":"+this.salary;
}
   
}
