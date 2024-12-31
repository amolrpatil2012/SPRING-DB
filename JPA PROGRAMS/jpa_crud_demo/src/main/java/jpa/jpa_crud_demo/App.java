package jpa.jpa_crud_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Student_details is a name of persistence unit given in persistence.xml file
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Student_details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }
}
