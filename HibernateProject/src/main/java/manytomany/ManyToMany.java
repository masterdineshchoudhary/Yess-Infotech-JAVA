package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
	public static void main(String[] args) {
		SessionFactory f= new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		
		Emp e1 = new Emp();
		e1.setEid(1);
		e1.setName("dinesh");
		
		Emp e2 = new Emp();
		e2.setEid(2);
		e2.setName("rohit");
		
		List<Emp> emplist = new ArrayList<Emp>();
		emplist.add(e1);
		emplist.add(e2);
		
		Project p1 = new Project();
		p1.setPid(11);
		p1.setProjectName("Banking system");
		
		Project p2 = new Project();
		p2.setPid(22);
		p2.setProjectName("DBMS system");
		
		List<Project> projectslist = new ArrayList<Project>();
		projectslist.add(p1);
		projectslist.add(p2);
		
		e1.setProjects(projectslist);
		e2.setProjects(projectslist);
		p1.setEmps(emplist);
		p2.setEmps(emplist);
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		t.commit();
		
		// Fetching Data
		Project data = session.get(Project.class, 11);
		System.out.println(data.getProjectName());
		System.out.println(data.getEmps());
		
		Emp info = session.get(Emp.class, 1);
		System.out.println(info.getName());
		System.out.println(info.getProjects());
		
		f.close();
	}
}
