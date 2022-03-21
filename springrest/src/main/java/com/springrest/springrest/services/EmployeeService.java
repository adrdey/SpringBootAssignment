package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.Employee;


public interface EmployeeService {
	
	public List<Employee>getEmployees();
	
	public Optional<Employee> getEmployee(int empId);
	
	public void addEmployee(Employee employee);

	public void updateEmployee(Employee emp);

	public void deleteEmployee(int empId);

	
}
