package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project startes......");

		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();

		Session session = factory.openSession();
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			Department dept = new Department("Technology", "Sector 18, Gurugram");

			Employee emp1 = new Employee("ABC", dept);
			Employee emp2 = new Employee("XYZ", dept);
			session.save(emp1);
			session.save(emp2);
			tr.commit();
		} catch (Exception e) {
			if (tr != null)
				tr.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
			System.out.println("session is Done.........");
		}

	}
}
