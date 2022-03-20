package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.services.EmployeeService;

@RestController
@RequestMapping("/emp")
public class MyController {

	@Autowired
private EmployeeService employeeService;
	//get the Employee Details

	@GetMapping("/get")
	public List<Employee>getEmployees(){
		return this.employeeService.getEmployees();
	}
	
	@GetMapping("/get/{empId}")
	public Employee getEmployee(@PathVariable int empId){
		return this.employeeService.getEmployee(empId);
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp){
		return this.employeeService.addEmployee(emp);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp){
		return this.employeeService.updateEmployee(emp);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam int empId){
		try {
			 this.employeeService.deleteEmployee(empId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
