package com.ty.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.employeeapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	
}
