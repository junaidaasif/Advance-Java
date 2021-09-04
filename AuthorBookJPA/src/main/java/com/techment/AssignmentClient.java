package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class AssignmentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = new Author();
		
		author.setName("Robert");
		
//		em.persist(author);
		
		BookAssignment book1 = new BookAssignment();
	
		book1.setTitle("Rich dad poor dad");
		book1.setPrice(500);
		book1.setAuthor(author);
		
//		em.persist(book1);
		
		
		BookAssignment book2 = new BookAssignment();
	
		book2.setTitle("Second Chance");
		book2.setPrice(1500);
		book2.setAuthor(author);
		
//		em.persist(book2);
		
		System.out.println("==========inserted=========");
		
		
		 Query query = em.createQuery( "Select b from BookAssignment b ");   
		
		 List<BookAssignment> list=(List<BookAssignment>)query.getResultList( );  
         
		 
		 for( BookAssignment b:list ){  
         System.out.println(b.getTitle());  
		 }
		 
		 
		 System.out.println("======Querry all book written by given author=====");
		 
//		 
//		 Query query2 = em.createQuery( "select b.title from BookAssignment b join Author a ON b.authorId = a.authorId where a.name = Robert");   
//			
//		 List<BookAssignment> list2=(List<BookAssignment>)query.getResultList( );  
//         
//		 
//		 for( BookAssignment b:list2 ){  
//         System.out.println(b.getTitle());  
//		 }
//		 
		 
		 System.out.println("=====given price range====");
		 
		
			
			
			 Query query3 = em.createQuery( "Select b from BookAssignment b where b.price between 1000 and 2000");   
			
			 List<BookAssignment> list3=(List<BookAssignment>)query3.getResultList( );  
	         
			 
			 for( BookAssignment b:list3 ){  
	         System.out.println("Book name is " + b.getTitle());  
			 }
			 
			 
			 
			 
			 System.out.println("======== List author name for give book name ========");
				
//			 Query query4 = em.createQuery( "select a.name from Author a join BookAssignment b where b.title = Second Chance");   
//			
//			 List<BookAssignment> list4=(List<BookAssignment>)query4.getResultList( );  
//	         
//			 
//			 for( BookAssignment b:list4 ){  
//	         System.out.println("Book name is " + b.getTitle());  
//			 }
//			 
//			 
		 
		em.getTransaction().commit();
		
		
		
	}

}
