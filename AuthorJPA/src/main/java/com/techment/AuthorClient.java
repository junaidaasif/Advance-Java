package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AuthorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
	
		System.out.println("=========Inserting===========");
		
		Author a1 = new Author();
		
		a1.setAuthorId(1);
		a1.setFirstName("Mohmmad");
		a1.setMiddleName("Junaid");
		a1.setLastName("Sheikh");
		a1.setPhoneNo("8770393764");
		
		em.persist(a1);
		
		
		
		Author a2 = new Author();
		
		a2.setAuthorId(2);
		a2.setFirstName("Mohmmad");
		a2.setMiddleName("aashu");
		a2.setLastName("Sheikh");
		a2.setPhoneNo("7748031422");
		
		em.persist(a2);
		
		System.out.println("==========Updating==========");
		
        Author s=em.find(Author.class,1);  
        System.out.println("Before Updation");  
        System.out.println("Student id = "+s.getAuthorId());  
        System.out.println("Student Name = "+s.getFirstName());  
        System.out.println("Student Age = "+s.getMiddleName());  
        System.out.println("Student Age = "+s.getLastName());  
        System.out.println("Student Age = "+s.getPhoneNo());  
          
        s.setPhoneNo("9301268996");  
          
        System.out.println("After Updation");  
        System.out.println("Student id = "+s.getAuthorId());  
        System.out.println("Student Name = "+s.getFirstName());  
        System.out.println("Student Age = "+s.getMiddleName());  
        System.out.println("Student Age = "+s.getLastName());  
        System.out.println("Student Age = "+s.getPhoneNo());    
        
        System.out.println("==============deleting======");
        
        em.remove(s);
        System.out.println("Removed");
		
		em.getTransaction().commit();  
        
        emf.close();  
        em.close(); 
		
		
	
	}

}
