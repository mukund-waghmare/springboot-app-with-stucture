package com.ty.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.employeeapp.dao.EmployeeDao;
import com.ty.employeeapp.dto.ResponseStucture;
import com.ty.employeeapp.entity.Employee;
import com.ty.employeeapp.exception.IdDoesNotPresentException;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	public ResponseEntity<ResponseStucture<Employee>> saveEmployee(Employee employee)
	{
		Employee receiveEmployee= employeeDao.saveEmployee(employee);
		
		ResponseStucture<Employee> resp= new ResponseStucture<>();
		resp.setStatusCode(HttpStatus.ACCEPTED.value());
		resp.setMessage("success");
		resp.setData(receiveEmployee);
		
		
		return new ResponseEntity<ResponseStucture<Employee>>(resp,HttpStatus.CREATED);
	}
	
	
	public ResponseEntity<ResponseStucture<Employee>> findEmployeeById(int id)
	{
		
		Employee employeeWithResult=employeeDao.findEmployeeById(id);
		
		if(employeeWithResult!=null)
		{
			ResponseStucture<Employee> resp= new ResponseStucture<>();
			
			resp.setStatusCode(HttpStatus.ACCEPTED.value());
			resp.setMessage("Success");
			resp.setData(employeeWithResult);
			
			return new ResponseEntity<ResponseStucture<Employee>>(resp,HttpStatus.OK);
		}
		else
		{
		
			throw new IdDoesNotPresentException(" ID  : "+id+" Not Present In DB ");
		}
	}

}
