package com.project.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory f= new Configuration().configure("HQL.cfg.xml").buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		
		Student s = new Student();
		s.setName("Dinesh");
		s.setCity("Pune");
		s.setCourse("Java");
		Student s2 = new Student();
		s2.setName("Rohit");
		s2.setCity("Hadapsar");
		s2.setCourse("Python");
		Student s3 = new Student();
		s3.setName("Neha");
		s3.setCity("Latur");
		s3.setCourse("C++");
		Student s4 = new Student();
		s4.setName("Ankit");
		s4.setCity("Pune");
		s4.setCourse("C++");
		
		session.save(s);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		t.commit();
		
//		HQL
		
//		String query = "From Student";
		String query = "From Student where city='Pune'";
		Query q = session.createQuery(query);
		List<Student> list = q.list();
		for (Student s1 : list) {
			System.out.println(s1.getCity()+" "+s1.getCourse()+" "+s1.getName());
		}
		
		session.close();
		f.close();
		
    }
}
