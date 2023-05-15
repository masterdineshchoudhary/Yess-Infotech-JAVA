package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCpractice {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/practice";
			String user = "root";
			String pass ="dinesh123";
			Connection con = DriverManager.getConnection(url,user,pass);
			
			if (con!=null) {
				System.out.println("connection successfull");
			}
			
//			if (con.isClosed()) {
//				System.out.println("connection is closed");
//			} else {
//				System.out.println("connnection is created");
//			}
			
//			String query = "create table table1(tId int primary key auto_increment, tName varchar(100), tCity varchar(100))";
//			String query = "insert into table1(tName,tCity) values('dinesh','pune')";
			
			String query = "insert into table1(tName,tCity) values(?,?)";
//			Statement statement = con.createStatement();
			PreparedStatement pStatement = con.prepareStatement(query);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name: ");
			String name = bReader.readLine();
			System.out.println("Enter city: ");
			String city = bReader.readLine();
//			pStatement.setString(1, "rohit");
//			pStatement.setString(2, "mumbai");
			pStatement.setString(1, name);
			pStatement.setString(2, city);
			pStatement.executeUpdate();
			
			System.out.println("query fired .. ");
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e);
		} 
	}
}
