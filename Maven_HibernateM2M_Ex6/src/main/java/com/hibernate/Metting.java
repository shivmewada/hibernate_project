package com.hibernate;

import java.util.Date;
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
@Table(name="metting")
public class Metting {
	@Column(name = "meeting_id")
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "meeting_date")
	private Date meetingDate;
	
	@ManyToMany(mappedBy = "metting", cascade=CascadeType.ALL )
	private Set<Employee> employees =new HashSet<Employee>();

	public Metting() {
		super();

	}

	public Metting(String subject,Date meetingDate) {
		super();
		this.subject = subject;
		this.meetingDate=meetingDate;
	}
	
	public Metting(String subject) {
		super();
		this.subject = subject;
		this.meetingDate=meetingDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

	public Set getEmployees() {
		return employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}
