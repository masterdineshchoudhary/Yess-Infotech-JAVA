package collection;

import java.util.Map;

public class CompanyMap {
	public String cName;
	public Map<Integer, Employee> employees;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Map<Integer, Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Map<Integer, Employee> employees) {
		this.employees = employees;
	}
	
}
