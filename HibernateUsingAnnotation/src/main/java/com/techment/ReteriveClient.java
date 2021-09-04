package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReteriveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		

		Student student = (Student)session.load(Student.class, new Integer(1));
		
		
		System.out.println("id " + student.getStudentid() + " Name " + student.getName() + "Dept " +student.getDept());
		transaction.commit();
	}

}
