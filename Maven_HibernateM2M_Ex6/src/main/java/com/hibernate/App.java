package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("project started........");
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Metting m1 = new Metting("Quaterly Status Meeting",new Date());
		Metting m2 = new Metting("Weekly Status Meeting",new Date());
	   Metting m3 = new Metting("Daily Status Meeting",new Date());

		Employee empObj1 = new Employee("Happy", "Potter");
		empObj1.getMetting().add(m1);
		
		Employee empObj2 = new Employee("java", "spring");
		empObj2.getMetting().add(m2);
		
		Employee empObj3 = new Employee("pythone", "Djengo");
		empObj3.getMetting().add(m3);
		 
		session.save(empObj1);
		session.save(empObj2);
		session.save(empObj3);

		tr.commit();
		session.close();
		factory.close();
		System.out.println("session is Done........");
	}
}
