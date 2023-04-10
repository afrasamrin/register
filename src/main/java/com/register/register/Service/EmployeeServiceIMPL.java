package com.register.register.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.register.register.Dto.EmployeeDTO;
import com.register.register.Repo.EmployeeRepo;
import com.register.register.Entity.Employee;;

@Service
public class EmployeeServiceIMPL implements EmployeeService{
	

	@Autowired
	private EmployeeRepo employeeRepo; 
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	

	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {
		
		Employee employee = new Employee(
			employeeDTO.getEmployeeid(),
			employeeDTO.getEmployeename(),
			employeeDTO.getEmail(),
			this.passwordEncoder.encode(employeeDTO.getPassword()),
			employeeDTO.getEmployeelastname(),
			employeeDTO.getEmployeephonename(),
			employeeDTO.getEmployeeorgname(),
			employeeDTO.getEmployeeorgadd()

		);
		
		employeeRepo.save(employee);
		// TODO Auto-generated method stub
		return employee.getEmployeename();
	}

}
