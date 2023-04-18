package com.sonata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonata.model.AdminModel;



public interface AdminRepository extends JpaRepository <AdminModel, Integer>{
	

	public AdminModel findByName(String userName);
	public AdminModel findByEmailId(String empEmail);
	public AdminModel findByEmailIdAndPassword(String empEmail,String password);

	


}
