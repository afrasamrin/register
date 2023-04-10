package com.register.register.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.register.Dto.EmployeeDTO;
import com.register.register.Service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employee")


public class EmplyeeController {
	
	@Autowired
	private EmployeeService employeeService; 

	
	
	@PostMapping(path = "/register")
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) 
	{
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}


}
