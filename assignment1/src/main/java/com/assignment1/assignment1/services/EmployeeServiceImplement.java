package com.assignment1.assignment1.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.assignment1.assignment1.entities.Employee;



@Service
public class EmployeeServiceImplement implements EmployeeService {
	
	
	public HashMap<Integer , Employee>employeeMap;
	public EmployeeServiceImplement() {
		Employee e1 = new Employee(1 , "Adrito" , "B7" , "SDET-1", "adritodey633@gmail.com" , 1234);
		Employee e2 = new Employee(2 , "Akshay" , "B7" , "SDET-1", "akshay@gmail.com" , 4321);
		Employee e3 = new Employee(3 , "Ajay" , "B7" , "SDET-1", "ajaystud@gmail.com" , 2222);
		Employee e4 = new Employee(4 , "Ragini" , "B7" , "SDET-1", "ragini@gmail.com" , 6666);
		Employee e5 = new Employee(5 , "Dharini" , "B7" , "SDET-1", "dharini@gmail.com" , 9999);
		employeeMap = new HashMap<Integer , Employee>() {
			{
				put(1, e1);
				put(2, e2);
				put(3, e3);
				put(4, e4);
				put(5, e5);
				
			}
		};
		
		
		
	}
	@Override
	public List<Employee> getEmployees() {
		List<Employee>employeeList = new ArrayList<>();
		for(Map.Entry<Integer, Employee>entry : employeeMap.entrySet()) {
			int key = entry.getKey();
			Employee value = entry.getValue();
			employeeList.add(value);
		}
		return employeeList;
		
	}
	@Override
	public Employee getEmployee(int empId) {
		
		Employee employee = null;
		if(employeeMap.containsKey(empId))
		 employee = employeeMap.get(empId);
		
		return employee;
		
	}
	
	@Override
	public String addEmployee(Employee emp) {
		if(emp == null)return "Employee NOT found!";
		
		employeeMap.put(emp.getEmpId() , emp);
		
		return "Successfully added Employee!";
		
	}
	
	@Override
	public String updateEmployee(Employee emp) {
		
		if(emp == null)return "Employee NOT found!";
		
		employeeMap.put(emp.getEmpId() , emp);
		
		return "Successfully updated Employee details!";
		
	}
	
	@Override
	public String deleteEmployee(int empId) {
		
		if(!employeeMap.containsKey(empId))
			return "Employee NOT found!"; 
		
		employeeMap.remove(empId);
		return "Employee record deleted successfully!";
	
	}
	

}

