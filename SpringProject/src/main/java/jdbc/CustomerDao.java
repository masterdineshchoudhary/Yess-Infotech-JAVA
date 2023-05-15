package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CustomerDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

/* 
 	// Simple CRUD operations
	// creating table
//	public void createTable() {
//		String query = "create table customer(id int, name varchar(40), address varchar(40), age int);";
//		jdbcTemplate.execute(query);
//	}
	
	// inserting data 
//	public void insertData() {
//		String query = "insert into customer values(101, 'Dinesh', 'KeshavNagar', 22);";
//		jdbcTemplate.update(query);		
//	}
	
	// updating data
//	public void updateData() {
//		String query = "update customer set name='Dinesh Choudhary' where id=101;";
//		jdbcTemplate.update(query);		
//	}
	
	// deleting data 
//	public void deleteData() {
//		String query = "delete from customer where name='Dinesh Choudhary';";
//		jdbcTemplate.update(query);		
//	}
*/	
	
	// Creating Customer table
	public void createTable() {
		String query = "create table customer(id int, name varchar(40), address varchar(40), age int);";
		jdbcTemplate.execute(query);
	}
	
	// Adding Customer
	public void addCustomer(int id, String name, String address, int age) {	
		String query = "insert into customer values("+id+",'"+ name +"','" +address+"',"+ age+")";
		jdbcTemplate.execute(query);
	}
	
	// getting a list of all customers from database
	public List<Customer> getAllCustomer() {
		String query = "select * from customer";
		return jdbcTemplate.query(query, new ResultSetExtractor<List<Customer>>() {
			public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Customer> customers = new ArrayList<Customer>();
				while (rs.next()) {
					Customer customer = new Customer();
					customer.setId(rs.getInt("id"));
					customer.setName(rs.getString("name"));
					customer.setAddress(rs.getString("address"));
					customer.setAge(rs.getInt("age"));
					customers.add(customer);
				}
				return customers;
			}
		});
	}
	
	// Updating a Customer
	public int updateCustomer(Customer c) {
		String query = "update customer set name='"+c.getName()+"' where id='"+c.getId()+"' ";
		return jdbcTemplate.update(query);		
	}
	
	// Deleting a Customer
	public void deleteCustomer(int id) {
		String query = "delete from customer where id="+id;
		jdbcTemplate.execute(query);	
		System.out.println("Deleted");
	}
	
	// Extracting a count of all the cutomers
	public int getCustomerCount() {
		String query = "select count(*) from customer";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}

}
