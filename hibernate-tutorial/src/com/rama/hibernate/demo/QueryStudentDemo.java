package com.rama.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rama.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {

			//create a student object
			session.beginTransaction();

			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudents(theStudents);
			
			// query students: lastName='Mac'
			theStudents = session.createQuery("from Student s where s.lastName='Mac'").getResultList();
			
			//display the students
			System.out.println("\n\nStudents who have last name of Mac");
			displayStudents(theStudents);
			
			// query students: lastName='Pitt' or firstName="Christo"
			theStudents = session.createQuery("from Student s where s.lastName='Pitt' OR s.firstName='Christo'").getResultList();
			
			//display the students
			System.out.println("\n\nStudents who have last name of Pitt ot first name of Christo");
			displayStudents(theStudents);
			
			// query students: email LIKE '%gmail.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
			
			//display the students
			System.out.println("\n\nStudents who have gmail");
			displayStudents(theStudents);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent: theStudents) {
			System.out.println(tempStudent.toString());
		}
	}

}
