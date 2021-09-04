package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Product product = new Product();
		
		product.setId(4);
		product.setName("xomputer");
		product.setPrice(6000);
		product.setCategory("electronics");
		
		
		em.persist(product);
		
		em.getTransaction().commit();  
		
	        em.close();  
	        emf.close();  
	}

}