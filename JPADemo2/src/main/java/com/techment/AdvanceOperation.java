package com.techment;

 
import javax.persistence.*;  
import java.util.*;  
public class AdvanceOperation{  
      
     public static void main( String args[]) {  
             
          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
            
          Query query = em.createQuery( "Select p from Product p where p.price between 5500 and 6500");  
            
//          @SuppressWarnings("unchecked")  
        List<Product> list=(List<Product>)query.getResultList( );  
           
          System.out.print("p_id");  
          System.out.print("\t p_name");  
         System.out.println("\t p_price");  
         System.out.println("\t p_category");  
            
            
          for( Product s:list ){  
             System.out.print( s.getId());  
             System.out.print("\t" +  s.getName());  
            System.out.print("\t" + s.getPrice( ));  
            System.out.print("\t" + s.getCategory( ));  
            System.out.println();  
          }  
          
          
          Query query2 = em.createQuery( "Select p from Product p where p.category electronics");  
          
//          @SuppressWarnings("unchecked")  
          List<Product> list2=(List<Product>)query2.getResultList( );  
          
          System.out.print("p_id");  
          System.out.print("\t p_name");  
          System.out.println("\t p_price");  
          System.out.println("\t p_category");  
          
          
          for( Product s:list2 ){  
        	  System.out.print( s.getId());  
        	  System.out.print("\t" +  s.getName());  
        	  System.out.print("\t" + s.getPrice( ));  
        	  System.out.print("\t" + s.getCategory( ));  
        	  System.out.println();  
          }  
          
          System.out.println("===================================");
          
          Query query3 = em.createQuery( "Select p from Product p where p.name like '%obil%' ");  
          
//          @SuppressWarnings("unchecked")  
          List<Product> list3=(List<Product>)query3.getResultList( );  
          
          System.out.print("p_id");  
          System.out.print("\t p_name");  
          System.out.print("\t p_price");  
          System.out.println("\t p_category");  
          
          
          for( Product s:list3 ){  
        	  System.out.print( s.getId());  
        	  System.out.print("\t" +  s.getName());  
        	  System.out.print("\t" + s.getPrice( ));  
        	  System.out.print("\t" + s.getCategory( ));  
        	  System.out.println();  
          }  
          
          
          
          em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  