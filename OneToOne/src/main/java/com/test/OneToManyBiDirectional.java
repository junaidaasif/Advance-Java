package com.test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBiDirectional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Library library = new Library();
		library.setName("abc library");
		
		em.persist(library);
		
		
		Book book1 = new Book();
		book1.setBookName("java");
		book1.setAutor("Junaid");
		book1.setLibrary(library);
		
		em.persist(book1);
		
		Book book2 = new Book();
		book2.setBookName("html");
		book2.setAutor("lenda");
		book2.setLibrary(library);
		
		em.persist(book2);
		
		System.out.println("==========inserted=========");
		
		
		em.getTransaction().commit();
	}

}
