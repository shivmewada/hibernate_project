package com.hibernate;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		org.jboss.logging.Logger log = LoggerFactory.logger(App.class);
		System.out.println("project is started......");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = null;
		try {
			tr=session.beginTransaction();
			EmployeeCache emp= new EmployeeCache(1,"shiv",5000);
			EmployeeCache emp1= new EmployeeCache(2,"vaibhav",50000);
			EmployeeCache emp2= new EmployeeCache(3,"rohan",25000);
			session.save(emp);
			session.save(emp1);
			session.save(emp2);
			tr.commit();
			System.out.println(emp.getId()+"-->"+emp.getName()+"-->"+emp.getSalary()+"-->");
			System.out.println(emp1.getId()+"-->"+emp1.getName()+"-->"+emp1.getSalary()+"-->");
			System.out.println(emp2.getId()+"-->"+emp2.getName()+"-->"+emp2.getSalary()+"-->");
			log.info("cegjwcewce {}"+ emp.getName() );
		} catch (NullPointerException  e) {
			if (tr != null)
				tr.rollback();
			//se.printStackTrace();
			System.out.println(e);

		} finally {
			session.close();
			factory.close();
			System.out.println("session is Done.........");
		}

	}
}
