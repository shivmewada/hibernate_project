package com.hibernate;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Answer {
	@Id
	@Column(name = "answer_id")
	private int answerId;
	
	private String ans_wer;
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAns_wer() {
		return ans_wer;
	}
	public void setAns_wer(String ans_wer) {
		this.ans_wer = ans_wer;
	}

	 

}
