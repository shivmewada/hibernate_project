package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
	public static void main(String args[])
	{
		System.out.println("Project is running...............");
		SessionFactory factory=new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Employee emp=new Employee();
		emp.setFirstName("Arjun");
		emp.setLastName("Mewada");
		emp.setSalary(20000);
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
		System.out.println("Session is Done.................");
	}
}
