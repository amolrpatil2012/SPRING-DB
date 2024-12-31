package org.example;

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
    	
        StudentEntity s1=new StudentEntity();
        s1.setRoll(1011);
        s1.setName("Gaurav");
        s1.setAge(24);

        StudentEntity s2=new StudentEntity();
        s2.setRoll(1021);
        s2.setName("Ronit");
        s2.setAge(22);

        StudentEntity s3=new StudentEntity();
        s3.setRoll(1031);
        s3.setName("Rahul");
        s3.setAge(26);
        
        Operations ops = new Operations();
        //ops.saveStudent(s1);
        //ops.saveStudent(s2);
        //ops.saveStudent(s3);
        
        //System.out.println(ops.findEntity(1021));
        
        ops.removeEntity(1021);

       
    }
}
