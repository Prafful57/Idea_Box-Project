package com.sonata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name = "UserInfo")
@Entity
public class UserLoginModel {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)//gives unique id
		private int userId;
		private int empId;
		private String name;
		private String password;
		private String emailId;
		private String dept;
		private String role;
		private String phone;
		
		
		
		public UserLoginModel() {
			super();
		}

		
		
		public int getEmpId() {
			return empId;
		}



		public void setEmpId(int empId) {
			this.empId = empId;
		}



		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
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
