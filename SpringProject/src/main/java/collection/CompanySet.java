package collection;

import java.util.Set;

// collection : SET

public class CompanySet {
	
	public String cName;
	public Set<Employee> employees;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
