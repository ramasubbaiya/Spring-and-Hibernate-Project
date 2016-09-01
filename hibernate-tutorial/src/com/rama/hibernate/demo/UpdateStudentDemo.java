package com.rama.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rama.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
			
			// delete student where id is 1
			System.out.println("Deleting student with id:1");
			session.delete(myStudent);

			// commit transaction
			session.getTransaction().commit();

			// NEW CODE
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//delete student where id is 3
			System.out.println("Deleting Student where id is 3");
			
			session.createQuery("delete from Student where id=3").executeUpdate();

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
