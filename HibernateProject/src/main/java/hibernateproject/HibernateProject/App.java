package hibernateproject.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory f = con.buildSessionFactory();
    	Session session = f.openSession();
    	Transaction t = session.beginTransaction();
    	
    	MyName m = new MyName();
    	m.setFname("dinesh");
    	m.setLname("choudhary");
    	
    	Student s = new Student();
    	s.setMyname(m);
//    	s.setName("abc");
    	s.setMarks(85);
    	session.save(s);
    	
//    	s = (Student) session.get(Student.class, 1);
    	t.commit();
//    	System.out.println(s);
    	session.close();
    	f.close();
    	
    }
}
