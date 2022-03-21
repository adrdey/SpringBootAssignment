package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
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
	public Optional<Employee> getEmployee(int empId) {

		return employeeDao.findById(empId);
				
	}
	
	@Override
	public void addEmployee(Employee emp) {
		

		 employeeDao.save(emp);
	}
	
	@Override
	public void updateEmployee(Employee emp) {
		
		 employeeDao.save(emp);
	}
	
	@Override
	public void deleteEmployee(int empId) {
		
		Employee entity = employeeDao.getOne(empId);
		 employeeDao.delete(entity);
	}
	

}
