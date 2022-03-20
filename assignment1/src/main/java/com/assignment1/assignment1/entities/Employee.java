package com.assignment1.assignment1.entities;


public class Employee {
private int empId;
private String empName;
private String empBand;
private String designation;
private String email;
private int phNo;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
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
