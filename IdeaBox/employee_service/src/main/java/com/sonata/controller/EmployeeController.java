package com.sonata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Employee;
import com.sonata.service.implementation.EmployeeServiceImp;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeServiceImp employeeServiceImp;
	
	//Create user request to upload
	@PostMapping
	public ResponseEntity<Employee>createEmployee(@RequestBody Employee emp){
		Employee emp1=employeeServiceImp.saveEmployee(emp);
		return ResponseEntity.status(HttpStatus.CREATED).body(emp1);
		
	}
	
	//get employee by empId and also can search by empId
	@GetMapping("/{empId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int empId){
		Employee emp=employeeServiceImp.getEmployeeById(empId);
		return ResponseEntity.ok(emp);
	}
	
	//delete employee by empId
	@DeleteMapping("/{empId}")
	public void deleteEmployee(@PathVariable int empId) {
		employeeServiceImp.deletEmployeeById(empId);
	}
	
	//login
	/* @GetMapping{"/login"}
	
	public String loginEmployee(@RequestParam String empName,@RequestParam String password,Model model) {
		String f="login";
		if(employeeServiceImp.verifyUser(empName, password)) {
			model.addAttribute("name",empName);
			model.addAttribute("pass",password);
			
		  f = "adminPage";
		}
		else if(employeeServiceImp.verifyUser(empName, password)) {
			model.addAttribute("name",empName);
			model.addAttribute("pass",password);
			f="empHomePage";
		}
			
		return f;
	} 



}*/
	

	
	
	

}
