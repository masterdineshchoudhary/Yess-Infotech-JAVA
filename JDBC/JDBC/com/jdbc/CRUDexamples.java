package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class CRUDexamples {
	
//	ADD INFO
	
	/*
	public void addInfo() {
		int res = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
			String query = "insert into info values(101,'emp1','add1')";
			Statement st = con.createStatement();
			res = st.executeUpdate(query);
			if (res>0) {
				System.out.println("record inserted successfully");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	*/
	
//	READ INFO
	
	/*
	public void readInfo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
			String query = "select * from info";
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(query);
			while (res.next()) {
				System.out.println(res.getInt(1) +" "+ res.getString(2) +" "+ res.getString(3));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	*/
	
//	UPDATE INFO
	
	/*
	public void updateInfo() {
		int res = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
			String query = "update info set empID=102 where empName='emp1'";
			Statement st = con.createStatement();
			res = st.executeUpdate(query);
			if (res>0) {
				System.out.println("record updated successfully");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	*/
	
//	DELETE INFO
	
	public void deleteInfo() {
		int res = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
			String query = "delete from info where empID=102";
			Statement st = con.createStatement();
			res = st.executeUpdate(query);
			if (res>0) {
				System.out.println("record delete successfully");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CRUDexamples crud = new CRUDexamples();
//		crud.addInfo();
//		crud.readInfo();
//		crud.updateInfo();
		crud.deleteInfo();
	}
}
