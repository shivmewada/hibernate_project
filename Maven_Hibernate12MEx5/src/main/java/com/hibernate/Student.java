package com.hibernate;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "student_id")
	private int sid;
	private String fname;
	private String lname;
	private String email;
	private String phono;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Marks_Detail> marksDetails;
	public Student( String fname, String lname, String email, String phono) {
		super();
		 
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phono = phono;
	}

	public Student() {
		super();

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhono() {
		return phono;
	}

	public void setPhono(String phono) {
		this.phono = phono;
	}

	public Set getMarksDetails() {
		return marksDetails;
	}

	public void setMarksDetails(Set marksDetails) {
		this.marksDetails = marksDetails;
	}

}
