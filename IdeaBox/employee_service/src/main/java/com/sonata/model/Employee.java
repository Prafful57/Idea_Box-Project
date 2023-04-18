package com.sonata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String password;
	private String email;
	private String dept;
	private String role;
	private String phone;
	
	public Employee() {}
	public Employee(int empId, String empName, String password, String email, String dept, String role, String phone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.password = password;
		this.email = email;
		this.dept = dept;
		this.role = role;
		this.phone = phone;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	

}
