package com.rama.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rama.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {		
			
			//create 3 student objects
			System.out.println("Creating 3 student objects...");
			Student tempStudent1 = new Student("Brad", "Pitt", "brad@gmail.com");
			Student tempStudent2 = new Student("Christo", "Nolan", "christo@gmail.com");
			Student tempStudent3 = new Student("John", "Oliver", "john@gmail.com");

			// start a transaction
			session.beginTransaction();
			
			// use the session object to save Java object
			System.out.println("Saving the student...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
