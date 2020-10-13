package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project statrted......." );
        SessionFactory factory=new Configuration().configure("hibernate.config.xml").
        		buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Student s=new Student("Ajay","Mewada","ajay@gmail.com","123456");
        session.save(s);
        Marks_Detail mrk=new Marks_Detail("English", 100, 90,  "Pass");
        mrk.setStudent(s);
        session.save(mrk);
        
        Marks_Detail mrk1=new Marks_Detail("Maths", 100, 99,  "Pass");
        mrk1.setStudent(s);
        session.save(mrk1);
        
        Marks_Detail m=new Marks_Detail("Science",100,89,"pass");
        m.setStudent(s);
        session.save(m);
        tr.commit();
        
        session.close();
        factory.close();
        System.out.println("session is Done............");
    }
}
