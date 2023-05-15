package com.webapp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UserDao {
	public static int save(UserBean u) {
		int i = 0;
		SessionFactory f = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		i = (Integer) session.save(u);
		t.commit();
		session.close();
		return i;
 	}
	
	public static void delete(UserBean u) {
		SessionFactory f = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		session.delete(u);
		t.commit();
		session.close();
	}
	
	public static List<UserBean> getAllRecords() {
		SessionFactory f = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		UserBean u = new UserBean();
		Query query = session.createQuery("from UserBean");
		List<UserBean> stud = query.list();
		stud.add(u);
		return stud;
	}
	
	public static UserBean getRecordById(int id) {
		SessionFactory f = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		UserBean u = session.get(UserBean.class, id);
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u);
		return null;
	}
}
