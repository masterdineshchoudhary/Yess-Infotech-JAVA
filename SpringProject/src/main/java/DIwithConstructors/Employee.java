package DIwithConstructors;

public class Employee {
	private int id;
	private String name;
	private Address address; // aggregation
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}
	
	public void display() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", address=" + address + "]");
	}
}
