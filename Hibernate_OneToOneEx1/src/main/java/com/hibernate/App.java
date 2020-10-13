package com.hibernate;

import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		System.out.println(" project started......");
		SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.config.xml")
				.buildSessionFactory();
		// create a question 1
		
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java ?");

		// create a answer
		Answer ans = new Answer();
		ans.setAnswerId(343);
		ans.setAns_wer("java is programming language");

		q1.setAnswer(ans);
		
		// session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		// save
		s.save(q1);
		/* s.save(q2); */
		tx.commit();
		s.close();
		factory.close();
		System.out.println("session is Done.......");
	}
}
