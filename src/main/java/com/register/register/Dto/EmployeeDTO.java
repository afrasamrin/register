package com.register.register.Dto;


public class EmployeeDTO {

	

	private int employeeid;
	private String employeename;
	private String email;
	private String password;
	private String employeelastname;
	private String employeephonename;
	private String employeeorgname;
	private String employeeorgadd;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeDTO [employeeid=").append(employeeid).append(", employeename=").append(employeename)
				.append(", email=").append(email).append(", password=").append(password).append(", employeelastname=")
				.append(employeelastname).append(", employeephonename=").append(employeephonename)
				.append(", employeeorgname=").append(employeeorgname).append(", employeeorgadd=").append(employeeorgadd)
				.append("]");
		return builder.toString();
	}
	public EmployeeDTO(int employeeid, String employeename, String email, String password, String employeelastname,
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
	public EmployeeDTO() {
		
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