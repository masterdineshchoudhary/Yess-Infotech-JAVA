package Autowiring.constructor;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	public Employee() {
		System.out.println("Default Constructor");
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Values");
		this.address = address;
	}

	@Override
	public String toString() {
		System.out.println("tostringmtd() call");
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
