package com.techment;

 
import javax.persistence.*;  
import java.util.*;  
public class BulkClient{  
      
     public static void main( String args[]) {  
             
          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
            
          Query query = em.createQuery( "Select p from Product p ");  
            
//          @SuppressWarnings("unchecked")  
        List<Product> list=(List<Product>)query.getResultList( );  
           
          System.out.print("s_id");  
          System.out.print("\t s_name");  
         System.out.println("\t s_age");  
            
            
          for( Product s:list ){  
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