package inheritancemapping;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("regularEmployee")
@Table(name="inh_reg_emp")
//@AttributeOverride(name="id", column=@Column(name="eid"))
//@AttributeOverride(name="name", column=@Column(name="ename"))
public class RegularEmployee extends Employee {
	private int salary;
	private int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
