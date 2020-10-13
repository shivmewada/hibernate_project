package com.hibernate;

import java.util.Date;

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
		System.out.println("project started.....");
		Configuration cfg = new Configuration();
		// SessionFactory factory=new Configuration().configure().buildSessionFactory();
		cfg.configure("hibernatecfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// create student object
		student st = new student();
		st.setSid(104);
		st.setName("jhon");
		st.setCity("MUMBAI");

		// create address object
		Address ad = new Address();
		ad.setStreet("street1");
		ad.setCity("madhya pradesh");
		/*
		 * ad.setCity("guna"); ad.setIsopen(true); ad.setAddedDate(new Date());
		 * ad.setX(10);
		 */

		Session session = factory.openSession();

		Transaction tr = session.beginTransaction();
		session.save(st);
		session.save(ad);
		System.out.println("session is done.......");
		tr.commit();
		session.close();
		// System.out.println(st);

	}
}
