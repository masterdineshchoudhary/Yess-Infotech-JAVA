package com.hibernateproject.HCQLProject;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory f = new Configuration().configure().buildSessionFactory();
        Session session = f.openSession();
        Transaction t = session.beginTransaction();
        
        EmployeeInfo e = new EmployeeInfo();
//        e.setName("dinesh");
//        e.setCity("pune");
//        e.setProject("java");
//        e.setSalary("1000");
//        
//        session.save(e);
//        t.commit();
        
        Criteria c = session.createCriteria(EmployeeInfo.class);
//        c.add(Restrictions.eq("project", "java"));
//        c.add(Restrictions.gt("id", 3));
//        c.add(Restrictions.lt("id", 3));
//        c.add(Restrictions.between("id", 1, 4));
//        c.add(Restrictions.like("project", "python"));
//        c.addOrder(Order.asc("salary"));
//        c.setFirstResult(2);
//        c.setMaxResults(4);
//        List<EmployeeInfo> emp = c.list();
//        for (EmployeeInfo employeeInfo : emp) {
//			System.out.println(employeeInfo);
//		}
        
        // SINGLE PROJECTIONS
        
////        c.setProjection(Projections.max("salary")); 
////        Projection projection = Projections.property("name");
//        Projection projection = Projections.max("salary");
//        c.setProjection(projection); 
////        c.setProjection(projection);
//        List list = c.list();
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//			String s1 = (String) iterator.next();
//			System.out.println(s1);
//		}
        
        // MULTIPLE PROEJECTIONS
        
        Projection projection1 = Projections.property("name");
        Projection projection2 = Projections.property("project");
        Projection projection3 = Projections.property("salary");
        ProjectionList pList = Projections.projectionList() ;
        pList.add(projection1);
        pList.add(projection2);
        pList.add(projection3);
        c.setProjection(pList);
        List list = c.list();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
			Object[] obj = (Object[]) iterator.next();
			System.out.println(obj[0]+" : "+obj[1]+" : "+obj[2]);
		}
        
        session.close();
        f.close();
         
    }
}
