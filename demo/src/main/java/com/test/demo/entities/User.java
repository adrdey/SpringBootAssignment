package com.test.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
private int userId;
private String userName;
private String firstName;
private String lastName;
private String designation;
private String password;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String userName, String firstName, String lastName, String designation, String password) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.firstName = firstName;
	this.lastName = lastName;
	this.designation = designation;
	this.password = password;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", designation=" + designation + ", password=" + password + "]";
}



}
