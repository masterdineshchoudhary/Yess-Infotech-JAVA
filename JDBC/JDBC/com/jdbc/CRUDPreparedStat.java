package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class CRUDPreparedStat {
	/*
	public void addInfo() throws ClassNotFoundException, SQLException {
		int res = 0;	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
		PreparedStatement pst = con.prepareStatement("insert into info values(?,?,?)");
		pst.setInt(1, 105);
		pst.setString(2, "rohit");
		pst.setString(3, "address 1");
		res = pst.executeUpdate();
		if (res>0) {
			System.out.println("record inserted successfully");
		}
	}
	*/
	
	/*
	public void readInfo() throws ClassNotFoundException, SQLException {	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
		PreparedStatement pst = con.prepareStatement("select * from info");
		ResultSet res = pst.executeQuery();
		while (res.next()) {
			System.out.println(res.getInt(1) +" "+ res.getString(2) +" "+ res.getString(3));
		}
	}
	*/
	
	/*
	public void updateInfo() throws ClassNotFoundException, SQLException {
		int res = 0;	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
		PreparedStatement pst = con.prepareStatement("update info set empName ='dinesh' where empID=105");
		res = pst.executeUpdate();
		if (res>0) {
			System.out.println("record Updated successfully");
		}
	}
	*/
	
	public void deleteInfo() throws ClassNotFoundException, SQLException {
		int res = 0;	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
		PreparedStatement pst = con.prepareStatement("delete from info where empID=105");
		res = pst.executeUpdate();
		if (res>0) {
			System.out.println("record Deleted successfully");
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CRUDPreparedStat crud = new CRUDPreparedStat();
//		crud.addInfo();
//		crud.readInfo();
//		crud.updateInfo();
		crud.deleteInfo();
	}
}
