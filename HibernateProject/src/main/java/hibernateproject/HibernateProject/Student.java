package hibernateproject.HibernateProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
//	private String name;
	private MyName myname;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	public MyName getMyname() {
		return myname;
	}
	public void setMyname(MyName myname) {
		this.myname = myname;
	}
//	@Override
//	public String toString() {
//		return "Student [id="+id+", name="+name+", marks="+marks+"]";
//	}
	
	
}
