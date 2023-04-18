package com.sonata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonata.model.AdminModel;

import com.sonata.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repo;

	public AdminModel saveUser(AdminModel user) {
		return repo.save(user);
	}

	public AdminModel fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}

	public AdminModel findByEmailIdAndPassword(String email, String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}


}
