package com.pagination;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.project.HQL.Student;

public class HQLPagination {
	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure("HQL.cfg.xml").buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("from Student");
		
		query.setFirstResult(0);
		query.setMaxResults(2);
		
		List<Student> list = query.list();
		
	
		for (Student st : list) {
			System.out.println(st.getId()+" "+st.getName()+" "+st.getCity()+" "+st.getCourse());
		}
		
		session.close();
		f.close();
		
 		
	}
}
