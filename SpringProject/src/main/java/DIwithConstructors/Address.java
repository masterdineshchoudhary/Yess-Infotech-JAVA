package DIwithConstructors;

public class Address {
	private String addressline, city, state, country;

	public Address(String addressline, String city, String state, String country) {
		super();
		this.addressline = addressline;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressline=" + addressline + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
	
}
