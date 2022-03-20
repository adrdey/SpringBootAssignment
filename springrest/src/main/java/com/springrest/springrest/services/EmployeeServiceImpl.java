package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {

	}
	@Override
	public List<Employee> getEmployees() {
		
			return employeeDao.findAll();
	}
	@Override
	public Employee getEmployee(int empId) {

		return employeeDao.getOne(empId);
	}
	
	@Override
	public Employee addEmployee(Employee emp) {
		

		return employeeDao.save(emp);
	}
	
	@Override
	public Employee updateEmployee(Employee emp) {
		
		return employeeDao.save(emp);
	}
	
	@Override
	public void deleteEmployee(int empId) {
		
		Employee entity = employeeDao.getOne(empId);
		 employeeDao.delete(entity);
	}
	

}
