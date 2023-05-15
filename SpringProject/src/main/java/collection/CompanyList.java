package collection;

import java.util.List;
// collection : LIST 
public class CompanyList {
	public String cName;
	public List<Employee> employees;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
