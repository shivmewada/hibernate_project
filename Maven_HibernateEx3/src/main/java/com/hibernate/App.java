package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("project is Running........");
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Teacher tr = new Teacher();
		tr.setId(152);
		tr.setName("shivam");
		tr.setCity("ujjain");
		tr.setAddress("mahakal mander gali no. 4 pin 462003");
		tr.setMob(123456);
		Session session = factory.openSession();
		Transaction tra = session.beginTransaction();
		session.save(tr);
		tra.commit();
		session.close();
	}
}
