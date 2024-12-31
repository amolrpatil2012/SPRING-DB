package org.example;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Operations {
	
	
	
	 public static EntityManager getEntityManager() {
		 
		 	// Student_details is a name of persistence unit given in persistence.xml file
	        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Student_details");       
	        return entityManagerFactory.createEntityManager();
	    }
	 
	 public void saveStudent ( StudentEntity s)
	 {
		 	EntityManager em = Operations.getEntityManager();
	        em.getTransaction().begin();
	        em.persist(s);
	        em.getTransaction().commit();
	 }
	 public StudentEntity findEntity( int id) {
	        EntityManager entityManager = Operations.getEntityManager();
	        entityManager.getTransaction().begin();
	        StudentEntity student = entityManager.find(StudentEntity.class, id);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	        return student;
	    }
	 public void updateEntity( int id , String name , int age) {
		 	EntityManager entityManager = Operations.getEntityManager();
	        entityManager.getTransaction().begin();

	        StudentEntity student = entityManager.find(StudentEntity.class, id);
	        System.out.println(student);
	        // The entity object is physically updated in the database when the transaction
	        // is committed
	        student.setName(name);
	        student.setAge(age);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }
	 public void removeEntity(int id) {
		 	EntityManager entityManager = Operations.getEntityManager();
	        entityManager.getTransaction().begin();

	        StudentEntity student =entityManager.find(StudentEntity.class, id);
	        System.out.println(student);
	         entityManager.remove(student);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }
	 
}
