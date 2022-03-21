package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class Employee {
	
	@Id
	@NonNull
private int empId;
	@NonNull

private String empName;
	@NonNull

private String empBand;
	@NonNull

private String designation;
	@Email
	@NotBlank
private String email;

	@NonNull
private int phNo;
public Employee() {
	super();
	
}
public Employee(int empId, String empName, String empBand, String designation, String email, int phNo) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empBand = empBand;
	this.designation = designation;
	this.email = email;
	this.phNo = phNo;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpBand() {
	return empBand;
}
public void setEmpBand(String empBand) {
	this.empBand = empBand;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhNo() {
	return phNo;
}
public void setPhNo(int phNo) {
	this.phNo = phNo;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empBand=" + empBand + ", designation=" + designation
			+ ", email=" + email + ", phNo=" + phNo + ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName()
			+ ", getEmpBand()=" + getEmpBand() + ", getDesignation()=" + getDesignation() + ", getEmail()=" + getEmail()
			+ ", getPhNo()=" + getPhNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


}
