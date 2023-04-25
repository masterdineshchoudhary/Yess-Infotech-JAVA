package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/dineshdb", "root", "dinesh123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static int save(UserBean u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into registration(name,city,email,password) values(?,?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getCity());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			status=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static int update(UserBean u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("update registration set name=?,city=?,email=?,password=? where id=?");
			ps.setString(1, u.getName());
			ps.setString(2, u.getCity());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			ps.setInt(5, u.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static int delete(UserBean u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from registration where id=?");
			ps.setInt(1, u.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static List<UserBean> getAllRecords() {
		List<UserBean> list = new ArrayList<UserBean>();
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from registration");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				UserBean u = new UserBean();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setCity(rs.getString("city"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				list.add(u);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
	public static UserBean getRecordById(int id) {
		UserBean u = null;
		try {
			Connection con = getConnection();
		 	PreparedStatement ps = con.prepareStatement("select * from registration where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new UserBean();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setCity(rs.getString("city"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}
	
}
