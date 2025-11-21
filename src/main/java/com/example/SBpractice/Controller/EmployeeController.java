package com.example.SBpractice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SBpractice.Entity.Employee;
import com.example.SBpractice.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("insertNewEmployee")
	public String insertEmployee(@RequestBody Employee employee) {
		
		return service.insertEmployee(employee);
	}
	
	@GetMapping("displayEmployeeById/{id}")
	public Employee displayEmployeeById(@PathVariable int id) {
		
		return service.display(id);
	}

}
