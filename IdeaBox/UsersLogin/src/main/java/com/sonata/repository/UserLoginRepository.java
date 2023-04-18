package com.sonata.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sonata.model.UserLoginModel;

public interface UserLoginRepository extends JpaRepository<UserLoginModel, Integer>{


	public UserLoginModel findByName(String userName);
	public UserLoginModel findByEmailId(String empEmail);
	public UserLoginModel findByEmailIdAndPasswordAndEmpId(String empEmail,String password,int empId);


}
