package studentcertificate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapCertificate {
	public static void main(String[] args) {
		SessionFactory f= new Configuration().configure().buildSessionFactory();
    	Session session = f.openSession();
    	Transaction t = session.beginTransaction();
    	
    	Certificate certificate = new Certificate();
    	certificate.setcId(101);
    	certificate.setcName("java full stack");
    	
    	Student student = new Student();
    	student.setStuid(1);
    	student.setStuname("dinesh");
    	student.setCertificate(certificate);
    	
//    	session.save(certificate);
    	session.save(student);
    	
    	t.commit();
    	session.close();
    	f.close();
	}
}
