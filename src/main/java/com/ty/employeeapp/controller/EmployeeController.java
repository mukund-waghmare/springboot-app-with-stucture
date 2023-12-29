package com.ty.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.employeeapp.dto.ResponseStucture;
import com.ty.employeeapp.entity.Employee;
import com.ty.employeeapp.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Operation(description = "To Save User Info",summary = "User Will Be Saved In The DataBase")
	@ApiResponses(value = @ApiResponse(description = "User Created",responseCode = "201"))
	@PostMapping("/employee")
	private ResponseEntity<ResponseStucture<Employee>> saveEmployee(@RequestBody  Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
	@PostMapping("/getById/{id}")
	private ResponseEntity<ResponseStucture<Employee>> getEmployeeById(@PathVariable int id)
	{	
		return employeeService.findEmployeeById(id);
	}
	{
		
	}
}
