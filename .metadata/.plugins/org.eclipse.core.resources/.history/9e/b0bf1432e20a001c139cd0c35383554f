package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Address address = new Address();
		
		address.setDoorNo(1002);
		address.setStreetName("BTM");
		address.setCity("Bhilai");
		
		
		
		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("Junaid");
		employee.setDesignation("hr");
		employee.setAddress(address);
		
		
		em.persist(address);
		em.persist(employee);
		
		System.out.println("==========inserted=========");
		
		
		em.getTransaction().commit();
	}

}
