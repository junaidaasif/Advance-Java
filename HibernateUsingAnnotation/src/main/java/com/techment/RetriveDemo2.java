package com.techment;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetriveDemo2 {
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Query<Student> query = session.createQuery("select s.Studentid, s.name from Student s");
	    List<Student> st = query.list();
	    
	    for(Object s:st) {
	    	Student stu = (Student)s;
	    	System.out.println(stu.getStudentid() + "  "  + stu.getName());
	    }
		
		
		
		session.close();
		sessionFactory.close();
		
	}
}
