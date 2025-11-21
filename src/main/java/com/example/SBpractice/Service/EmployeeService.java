package com.example.SBpractice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SBpractice.Dao.EmployeeDao;
import com.example.SBpractice.Entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao dao;

	
	public String  insertEmployee(Employee employee) {
		
		
		
		boolean result=dao.insertEmployee(employee);
		
		if (result) return "Employee inserted successfully";
		 else return"failed to insert";
           
		
	}


	public Employee display(int id) {
		
		Employee emp=dao.display(id);
		if (emp!=null) {
			return emp;
		} else {
               return null;

		}
	}

}
