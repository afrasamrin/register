package com.register.register.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="employee")
public class Employee {

	@Id
	
	@Column(name="employee_id", length = 45)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;
	
	@Column(name="employee_name", length = 50)
	private String employeename;
	

	@Column(name="email", length = 254)
	private String email;
	
	@Column(name="password", length = 254)
	private String password;
	
	@Column(name="employee_last_name", length = 50)
	private String employeelastname;
	
	@Column(name="employee_phone", length = 10)
	private String employeephonename;
	
	@Column(name="employee_orgname", length = 1000)
	private String employeeorgname;
	
	@Column(name="employee_orgadd", length = 1000)
	private String employeeorgadd;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [employeeid=").append(employeeid).append(", employeename=").append(employeename)
				.append(", email=").append(email).append(", password=").append(password).append(", employeelastname=")
				.append(employeelastname).append(", employeephonename=").append(employeephonename)
				.append(", employeeorgname=").append(employeeorgname).append(", employeeorgadd=").append(employeeorgadd)
				.append("]");
		return builder.toString();
	}

	public Employee(int employeeid, String employeename, String email, String password, String employeelastname,
			String employeephonename, String employeeorgname, String employeeorgadd) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email = email;
		this.password = password;
		this.employeelastname = employeelastname;
		this.employeephonename = employeephonename;
		this.employeeorgname = employeeorgname;
		this.employeeorgadd = employeeorgadd;
	}

	public Employee() {
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeelastname() {
		return employeelastname;
	}

	public void setEmployeelastname(String employeelastname) {
		this.employeelastname = employeelastname;
	}

	public String getEmployeephonename() {
		return employeephonename;
	}

	public void setEmployeephonename(String employeephonename) {
		this.employeephonename = employeephonename;
	}

	public String getEmployeeorgname() {
		return employeeorgname;
	}

	public void setEmployeeorgname(String employeeorgname) {
		this.employeeorgname = employeeorgname;
	}

	public String getEmployeeorgadd() {
		return employeeorgadd;
	}

	public void setEmployeeorgadd(String employeeorgadd) {
		this.employeeorgadd = employeeorgadd;
	}

	
  

	
	
	

	
	
	
	
	
	
	
}
