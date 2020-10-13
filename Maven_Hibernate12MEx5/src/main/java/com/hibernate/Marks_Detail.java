package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marks_detail")
public class Marks_Detail {
	@Id
	@GeneratedValue
	private int testId;
	private String subject;
	private int maxmarks;
	private int obtainedmarks;
	private String result;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Student student;

	public Marks_Detail() {
		super();

	}

	public Marks_Detail(String subject, int maxmarks, int obtainedmarks, String result) {
		super();

		this.subject = subject;
		this.maxmarks = maxmarks;
		this.obtainedmarks = obtainedmarks;
		this.result = result;

	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMaxmarks() {
		return maxmarks;
	}

	public void setMaxmarks(int maxmarks) {
		this.maxmarks = maxmarks;
	}

	public int getObtainedmarks() {
		return obtainedmarks;
	}

	public void setObtainedmarks(int obtainedmarks) {
		this.obtainedmarks = obtainedmarks;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
