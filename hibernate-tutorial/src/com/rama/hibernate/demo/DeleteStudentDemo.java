package com.rama.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rama.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		try {
			// create session and start transaction
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
			int studentId = 1;

			// retrieve a student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);

			Student myStudent = session.get(Student.class, studentId);
			
			// update first name to "Duck"
			System.out.println("Updating student...");
			myStudent.setFirstName("Duck");

			// commit transaction
			session.getTransaction().commit();

			// NEW CODE
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//update eamil for all students
			System.out.println("Update email for all students");
			
			session.createQuery("update Student set email='noname@gmail.com'").executeUpdate();

			// commit transaction
			session.getTransaction().commit();		
			
			System.out.println("Done!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
