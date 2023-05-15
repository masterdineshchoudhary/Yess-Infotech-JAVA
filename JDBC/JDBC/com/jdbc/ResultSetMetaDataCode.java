package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

// ResultSetMetaData (Interface) provides an additional info about the data
// if we want to get info about table (col name, col type, no of col)
// ResultSet methods : getMetaData() 
// ResultSetMetaData interface methods : getColumnName(), . . ., etc. 

public class ResultSetMetaDataCode {
	public void readData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","dinesh123");
			if (con!=null) {
				System.out.println("Connected Successfully\n");
			}
			String query = "select * from info";
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(query);
			
			while (res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3));
			}
			
			System.out.println();
			
			ResultSetMetaData remd = res.getMetaData();
			System.out.println(remd.getTableName(1)+" "+
			remd.getColumnCount()+" "+
			remd.getColumnClassName(2)+" "+
			remd.getColumnTypeName(1));
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ResultSetMetaDataCode metaDataCode = new ResultSetMetaDataCode();
		metaDataCode.readData();
	}
}
