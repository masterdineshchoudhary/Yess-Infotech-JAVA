package inheritancemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritMapping {
	public static void main(String[] args) {
		SessionFactory f= new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setName("Dinesh");

		RegularEmployee re = new RegularEmployee();
		re.setName("Vivek");
		re.setSalary(50000);
		re.setBonus(5);
		
		ContractEmployee ce = new ContractEmployee();
		ce.setName("Amar");
		ce.setPay_per_hour(1000);
		ce.setContract_duration("15 hours");
		
		session.save(employee);
		session.save(re);
		session.save(ce);
		
		t.commit();
		session.close();
		System.out.println("Success");
	}
}
