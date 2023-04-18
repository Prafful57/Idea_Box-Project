package com.sonata.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import com.sonata.model.UserLoginModel;
import com.sonata.repository.UserLoginRepository;

@Service
public class UserLoginService {
	@Autowired
	private UserLoginRepository repo ;
	
	public UserLoginModel saveUser(UserLoginModel user) {
	return repo.save(user);
	}
	public UserLoginModel fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	public UserLoginModel findByEmailIdAndPassword(String email,String password,int empId) {
		return repo.findByEmailIdAndPasswordAndEmpId(email, password,empId);
	}
	
	public UserLoginModel findByName(String name) {
		return repo.findByName(name);
	}

	//employee crud
	public UserLoginModel saveEmployee(UserLoginModel emp) {
		return repo.save(emp);
		
	}
	
	//get employee by empId from db
	public UserLoginModel getEmployeeById(int empId) {
		return repo.findById(empId).get();
	}
	
	//delete employee by empId from db
	public void deletEmployeeById(int empId) {
		repo.deleteById(empId);
		
	}

	

	
}
