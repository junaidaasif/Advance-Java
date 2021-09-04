package coml.techment.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Emp e1 =  new Emp("junaid" , "developer");
		Emp e2 =  new Emp("aashu" , "hr");
		
		//to store in db
		em.persist(e1);
		em.persist(e2);
		
				
		//to store all employee in list
		List<Emp> employees = new ArrayList<Emp>();
		employees.add(e1);
		employees.add(e2);
		
		Department d1 = new Department();
		d1.setName("hr");
		d1.setEmployees(employees);
		
		em.persist(d1);
		
		em.getTransaction().commit();
		
		
		
	}

}
