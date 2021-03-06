package com.techment;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectionUsingWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query qry = session.createQuery("select s from Student s where s.dept =:x");
		qry.setParameter("x", "hr");
		
		
		List<Student> list = qry.getResultList();
		
		list.forEach(s-> System.out.println(s.getStudentid() + " " + s.getName() + " " + s.getDept()));
		
		session.close();
		sessionFactory.close();
		
	}

}
