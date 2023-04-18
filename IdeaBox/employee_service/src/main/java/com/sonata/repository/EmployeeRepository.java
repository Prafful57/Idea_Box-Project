package com.sonata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
