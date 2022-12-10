package tg.ipnet.university.tp3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Program3 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("federations");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        et.commit();
        em.close();
        emf.close();
	}
}
