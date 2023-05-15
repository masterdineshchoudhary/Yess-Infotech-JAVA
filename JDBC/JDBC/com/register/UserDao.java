package com.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import regBean.UserInfo;

public class UserDao {
	Scanner sc = new Scanner(System.in);
	Connection con = ConnectionProvider.getConnection();

	//				REGISTER USER
	
	public void registerUser() {
		UserInfo ui = new UserInfo();
		System.out.println("Enter User Data");
//		ui.setEmpID(sc.nextInt());
		ui.setEmpFirstName(sc.nextLine());
		ui.setEmpLastName(sc.nextLine());
		ui.setEmpMob(sc.nextLine());
		ui.setEmpEmail(sc.nextLine());

		try {
//			String query = "insert into userinfo values(empID, empFirstName, empLastName, empMob, empEmail)";
			String query = "insert into userinfo(empFirstName, empLastName, empMob, empEmail) values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, ui.getEmpFirstName());
			pst.setString(2, ui.getEmpLastName());
			pst.setString(3, ui.getEmpMob());
			pst.setString(4, ui.getEmpEmail());

			int status = pst.executeUpdate();
			if (status > 0) {
				System.out.println("Successful");
			} else {
				System.out.println("not added");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//  			SHOW USER
	
	public void showUser() {
		try {
			PreparedStatement ps = con.prepareStatement("Select * from userinfo");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Id= "+rs.getInt(1)+" FirstName= "+rs.getString(2)+" LastName= "+rs.getString(3)+" Mob= "+rs.getString(4)+" Email= "+rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// 				SEARCH USER
	
	public void searchUser() {
		System.out.println("Enter the ID to serach");
		int id = sc.nextInt();
		try {
			PreparedStatement ps = con.prepareStatement("select * from userinfo where empID=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Id= "+rs.getInt(1)+" FirstName= "+rs.getString(2)+" LastName= "+rs.getString(3)+" Mob= "+rs.getString(4)+" Email= "+rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//					UPDATE RECORD
	
	public void updateData() {
		System.out.println("Enter id to update");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String s = sc.next();
		try {
			String query = "update userinfo set empFirstName=? where empID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, s);
			ps.setInt(2, id);
			
			int status = ps.executeUpdate();
			if (status>0) {
				System.out.println("Update successful");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	//					DELETE RECORD
	
	public void deleteData() {
		System.out.println("Enter id to delete");
		int id = sc.nextInt();
		try {
			String query = "delete from userinfo where empID=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			
			int status = ps.executeUpdate();
			if (status>0) {
				System.out.println("Delete successful");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//					INSERT ADDRESS INFO IN RECORD
	
	public void insertAddData() {
		System.out.println("Enter address details : ");
		Address a = new Address();
		a.setCity(sc.nextLine());
		a.setLocation(sc.nextLine());
		a.setPincode(sc.nextInt());
		System.out.println("Enter user id");
		int i = sc.nextInt();
		a.setId(i);
		
		try {
			String query = "insert into userinfoadd(city,location,pincode,id) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, a.getCity());
			ps.setString(2, a.getLocation());
			ps.setInt(3, a.getPincode());
			ps.setInt(4, a.getId());
			
			int status = ps.executeUpdate();
			if (status>0) {
				System.out.println("Address added successfully");
			} else {
				System.out.println("failed ");
			}
			
//			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//					JOIN
	
	public void joinInfo() {
		try {
//			String query = "select u.empID, u.empFirstName, u.empLastName, u.empMob, u.empEmail, a.city, a.location, a.pincode from userinfo u, userinfoadd a where u.empID=a.id";
			String query = "select u.empID, u.empFirstName, u.empLastName, u.empMob,"
					+"u.empEmail, a.city, a.location, a.pincode"
					+"from userinfo u, userinfoadd a where u.empID=a.id";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getString(7));
				System.out.println(rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		int c = 0;
		do {
			System.out.println("Welcome to Registration");
			System.out.println("1. Registration");
			System.out.println("2. Display all record");
			System.out.println("3. Searching for part record");
			System.out.println("4. Update record");
			System.out.println("5. delete record");
			System.out.println("6. insert address info record");
			System.out.println("7. joining");

			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			switch (n) {
			case 1: {
				userDao.registerUser();
				break;
			}
			case 2: {
				userDao.showUser();
				break;
			}
			case 3: {
				userDao.searchUser();
				break;
			}
			case 4: {
				userDao.updateData();
				break;
			}
			case 5: {
				userDao.deleteData();
				break;
			}
			case 6: {
				userDao.insertAddData();
				break;
			}
			case 7: {
				userDao.joinInfo();
				break;
			}
			default:
				break;
			}

			System.out.println("Please enter 1 to continue");
			c = scanner.nextInt();

		} while (c == 1);
		System.out.println("Thank You!!");
	}
}
