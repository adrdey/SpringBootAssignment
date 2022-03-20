package com.springrest.springrest.services;

import java.util.List;


import com.springrest.springrest.entities.Employee;


public interface EmployeeService {
	
	public List<Employee>getEmployees();
	
	public Employee getEmployee(int empId);
	
	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee emp);

	public void deleteEmployee(int empId);
}
