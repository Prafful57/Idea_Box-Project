package com.sonata.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.AdminModel;
import com.sonata.service.AdminService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AdminLoginController {
	
	@Autowired
	private AdminService service;
	
	//admin login using emailid and pass
	@PostMapping("/adminLogin")
	@CrossOrigin(origins="http://localhost:4200")
	public AdminModel loginUser (@RequestBody AdminModel user) throws Exception {
	String tempEmailId= user.getEmailId();
	String tempPass = user.getPassword();
	AdminModel userObj = null;
	if (tempEmailId != null && tempPass != null) {
		userObj=service.findByEmailIdAndPassword(tempEmailId, tempPass);
	}
	if(userObj == null) {
		throw new Exception("bad credentials");
	}
	return userObj;
	}
	

}
