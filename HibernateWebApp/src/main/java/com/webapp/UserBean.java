package com.webapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserBean {
	@Id
	@GeneratedValue
	private int id;
//	private String name; email, city, password;
	private String name;
	private String email;
	private String city;
	private String password;
	
	public int getId( ) {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName( ) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail( ) {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity( ) {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword( ) {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
