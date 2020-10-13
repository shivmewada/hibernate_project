package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class student {
	@Id
    private int sid;
	
    private String name;
    
    private String city;
    private Certificate certi;
    
	public student(int sid, String name, String city) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
	}
	public student() {
		super();
		 
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return  this.sid+" :"+this.name+":"+this.city;
	}
	
	
}
