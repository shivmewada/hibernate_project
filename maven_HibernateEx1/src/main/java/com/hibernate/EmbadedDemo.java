package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbadedDemo {

	public static void main(String[] args) {
		System.out.println("project started.....");
		Configuration cfg = new Configuration();
		// SessionFactory factory=new Configuration().configure().buildSessionFactory();
		cfg.configure("hibernatecfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// first student detail
		student stu = new student();
		stu.setSid(101);
		stu.setName("Rahul");
		stu.setCity("Hydrabad");

		Certificate certi = new Certificate();
		certi.setCourse("Android");
		certi.setDuration("2 month");
		stu.setCerti(certi);
		// second student detail
		student stu1 = new student();
		stu1.setSid(102);
		stu1.setName("Abhishek");
		stu1.setCity("kanpur");

		Certificate certi1 = new Certificate();
		certi1.setCourse("hibernate");
		certi1.setDuration("1.6 month");
		stu1.setCerti(certi1);

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		// save the object student
		session.save(stu);
		session.save(stu1);
		tr.commit();
		session.close();
		factory.close();
		System.out.println("session is Done........");

	}

}
