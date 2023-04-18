package com.sonata.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonata.model.Employee;
import com.sonata.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp {
	
	@Autowired
	private  EmployeeRepository empRepository;
	
	//create and upload data to db 
	public Employee saveEmployee(Employee emp) {
		return empRepository.save(emp);
		
	}
	
	//get employee by empId from db
	public Employee getEmployeeById(int empId) {
		return empRepository.findById(empId).get();
	}
	
	//delete employee by empId from db
	public void deletEmployeeById(int empId) {
		empRepository.deleteById(empId);
		
	}
	
	//login verification for admin and employee
	
	/*public boolean verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(username.equals("admin") && password.equals("admin@123")) {
			flag=true;
		}
		else if()
		return flag;
	}*/
	
	
	
	
	
	
	
	
	

}
