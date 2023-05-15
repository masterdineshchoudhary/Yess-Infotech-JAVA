package inheritancemapping;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@DiscriminatorValue("contractEmployee")
@Table(name="inh_cont_emp")
//@AttributeOverrides({
//	@AttributeOverride(name="id", column=@Column(name="eid")),
//	@AttributeOverride(name="name", column=@Column(name="ename"))
//})
public class ContractEmployee extends Employee {
	private int pay_per_hour;
	private String contract_duration;
	public int getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	
	
	
}
