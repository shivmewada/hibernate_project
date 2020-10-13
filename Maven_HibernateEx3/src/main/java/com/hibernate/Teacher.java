package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	private String city;
	private String address;
	private int mob;

	public Teacher(int id, String name, String city, String address, int mob) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
		this.mob = mob;
	}

	public Teacher() {
		super();
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.city + " " + this.address + " " + this.mob;
	}

}
