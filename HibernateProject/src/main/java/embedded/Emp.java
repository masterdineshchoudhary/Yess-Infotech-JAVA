package embedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernateproject.HibernateProject.Student;

public class Emp {
	public static void main(String[] args) {
		System.out.println("Project started..");
    	SessionFactory f= new Configuration().configure().buildSessionFactory();
    	Session session = f.openSession();
    	Transaction t = session.beginTransaction();
    	
    	Address address = new Address();
    	address.setArea("Hadapsar");
    	address.setCity("Pune");
    	address.setPincode(411028);
    	
    	Employee employee = new Employee();
    	employee.setEid(101);
    	employee.setEmpname("Dinesh");
    	employee.setAddress(address);
    	
    	session.save(employee);
    	t.commit();
    	employee = session.get(Employee.class, 101);
    	System.out.println(employee.getEid());
    	System.out.println(employee.getEmpname());
    	System.out.println(employee.getAddress().getArea());
    	System.out.println(employee.getAddress().getCity());
    	System.out.println(employee.getAddress().getPincode());

    	t.commit();
    	System.out.println(employee);
    	session.close();
    	f.close();
	}
}
