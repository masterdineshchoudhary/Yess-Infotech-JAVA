package collection;

//import java.util.Set;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Base {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		// collection : LIST
//		CompanyList company = context.getBean("CompanyBean", CompanyList.class);
//		List<Employee> emp = company.getEmployees();
//		for (Employee employee : emp) {
//			System.out.println("Emp Name : " + employee.getName() +
//							   ", Emp Salary : " + employee.getSalary() +
//							   ", Company Name : " + company.getcName());
		
		// collection : SET
//		CompanySet company = context.getBean("CompanyBean", CompanySet.class);
//		Set<Employee> emp = company.getEmployees();
//		for (Employee employee : emp) {
//			System.out.println("Emp Name : " + employee.getName() +
//							   ", Emp Salary : " + employee.getSalary() +
//							   ", Company Name : " + company.getcName());
//		}
		
		// collection : MAP
		CompanyMap company = context.getBean("CompanyBean", CompanyMap.class);
		Map<Integer, Employee> emp = company.getEmployees();
		Set<Map.Entry<Integer, Employee>> set = emp.entrySet();
		for (Map.Entry<Integer, Employee> employee : set) {
			System.out.println("Emp Name : " + employee.getValue().getName() +
					", Emp Salary : " + employee.getValue().getSalary() +
					", Company Name : " + company.getcName());
		}
		
	}
}
