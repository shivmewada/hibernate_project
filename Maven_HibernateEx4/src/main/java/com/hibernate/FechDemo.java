package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FechDemo {
    public static void main(String[] args) {
	// get or load
    	SessionFactory factory=new Configuration().configure("hibernate.config.xml").buildSessionFactory();
    	Session session=factory.openSession();
    	//Transection are the used only data save karna ho to
    	//get-Employee:1 or load
    	Employee employee=(Employee)session.load(Employee.class, 2);
    	System.out.println(employee);
    	System.out.println(session.get(Employee.class, 1)+" = "+employee.getFirstName());
    	session.close();
    	factory.close();
   }
}
