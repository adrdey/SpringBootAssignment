package com.assignment1.assignment1.services;

import java.util.List;

import com.assignment1.assignment1.entities.Employee;

public interface EmployeeService {
	
	public List<Employee>getEmployees();
	
	public Employee getEmployee(int empId);
	
	public String addEmployee(Employee employee);

	public String updateEmployee(Employee emp);

	public String deleteEmployee(int empId);
}
