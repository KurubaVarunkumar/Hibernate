package com.JPA.com.JPA;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.Query;

public class App {
    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager em = emf.createEntityManager();

//        Student student = em.find(Student.class, 1);
//        System.out.println(student);
        
//        TypedQuery<Student> s=null;
//        
//        s=em.createQuery("Select * from Student",Student.class);
//        s=s.list();
//        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager em = emf.createEntityManager();
//     // Begin a transaction
//        EntityTransaction transaction = em.getTransaction();
//        transaction.begin();
//  
//        //Insert 
//        Random r=new Random();
//        
//        for(int i=1;i<=50;i++) {
//        	Student s=new Student();
//        	s.setS_id(i);
//            s.setS_name("Name "+i);
//            s.setS_course("MCA");
//            
//            em.persist(s);
//        }
//        
//        
//        
//        
//        
//        
////			for Read
////       Student s=em.find(Student.class, 1);
////       System.out.println(s);
//
//        // Close EntityManager and EntityManagerFactory when done
//        transaction.commit(); 
//        emf.close();
        // Create an EntityManagerFactory using persistence unit name
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

        // Create an EntityManager
        EntityManager em = emf.createEntityManager();

        // Begin a transaction
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        try {
            // Insert 50 Student records with random data
            Random r = new Random();

            for (int i = 1; i <= 50; i++) {
                Student s = new Student();
                s.setS_id(i);
                s.setS_name("Name " + i);
                s.setS_course("MCA");
                
                em.persist(s);
            }

            // Commit the transaction
            transaction.commit();
            System.out.println("Records persisted successfully.");

            // For Read: Retrieve and print a student (e.g., student with ID 1)
            Student retrievedStudent = em.find(Student.class, 1);
            System.out.println("Retrieved Student: " + retrievedStudent);

        } catch (Exception e) {
            // Rollback the transaction in case of an exception
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close EntityManager and EntityManagerFactory
            em.close();
            emf.close();
        }
    }
}

        
        
    