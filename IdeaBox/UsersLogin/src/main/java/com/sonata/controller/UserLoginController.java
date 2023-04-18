package com.sonata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
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
import org.springframework.web.client.RestTemplate;


import com.sonata.model.UserLoginModel;
import com.sonata.repository.UserLoginRepository;
import com.sonata.service.UserLoginService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserLoginController {

	@Autowired
	private UserLoginService service;

		
		//get employee by empId and also can search by empId
	
	
		@GetMapping("/{empId}")
		public ResponseEntity<UserLoginModel> getEmployee(@PathVariable int empId){
			UserLoginModel emp = service.getEmployeeById(empId);
			return ResponseEntity.ok(emp);
			
		}
		
		//delete employee by empId
		@DeleteMapping("/{empId}")
		public void deleteEmployee(@PathVariable int empId) {
			service.deletEmployeeById(empId);
		}
	
		//Registration and validation
	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4200")
	public UserLoginModel registerUser(@RequestBody UserLoginModel user) throws Exception
	{String tempEmailId= user.getEmailId();
	if (tempEmailId != null && !"".equals (tempEmailId)) {
		UserLoginModel userobj = service.fetchUserByEmailId(tempEmailId); 
		if (userobj!= null) {
	throw new Exception ("user with "+tempEmailId+" is already exist");
	}
	}
     UserLoginModel userObj = null;
	userObj=service.saveUser(user);
	return userObj;
	}
    //login using emailid and  pass
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public UserLoginModel loginUser (@RequestBody UserLoginModel user) throws Exception {
	String tempEmailId= user.getEmailId();
	String tempPass = user.getPassword();
	int tempEmpid = user.getEmpId();
	UserLoginModel userObj = null;
	if (tempEmailId != null && tempPass != null && tempEmpid != 0 ) {
		userObj=service.findByEmailIdAndPassword(tempEmailId, tempPass,tempEmpid);
	}
	if(userObj == null) {
		throw new Exception("bad credentials");
	}
	return userObj;
	}
	


	
}

