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
		System.out.println("project started.......");
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Employee emp = new Employee();
		emp.setEid(10002);
		emp.setName("abhishek sir");
		emp.setCity("pune");
		emp.setSalary(55000);

		Session session = factory.openSession();

		Transaction tr = session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
		
	}
}
