package com.ty.employeeapp.dao;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.ty.employeeapp.entity.Employee;
import com.ty.employeeapp.exception.IdDoesNotPresentException;
import com.ty.employeeapp.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee passedEmployee)
	{
		return repository.save(passedEmployee);
		
	}
	
	public Employee findEmployeeById(int id)
	{
      Optional<Employee> optional=optional=repository.findById(id);
    
    	 if(optional.isPresent())
    	 {
    		 return optional.get();
    	 }
    	 else
    	 {
    		throw new IdDoesNotPresentException("Id"+id+" Not Present ");
    	 }
      
      
	}

}
