package com.manytoone;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Courses python = new Courses(70, "python", 4);
		em.persist(python);

		
		Students junaid = new Students();
		junaid.setId(5);
		junaid.setName("Junaid");
		junaid.setCourse(python);
		
		
		Students junaid2 = new Students();
		junaid2.setId(6);
		junaid2.setName("aashu");
		junaid2.setCourse(python);
		
		Students junaid3 = new Students();
		
		junaid3.setId(7);
		junaid3.setName("ankit");
		junaid3.setCourse(python);
		
		em.persist(junaid);
		em.persist(junaid2);
		em.persist(junaid3);
		
		System.out.println("==========inserted=========");
		
		
		em.getTransaction().commit();
	       em.close();  
	        emf.close(); 
	}

}
