package com.assignment3.CourseManagementSystem.Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	
	private String userName;
	
	private String firstName;
	
	private String lastName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Designation designation;
	
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "users")
	private Set<Course>courses = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
	private List<Review>reviews = new ArrayList<>();
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int userId, String userName, String firstName, String lastName, Designation designation,
			String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.password = password;
		
	}


	public List<Review> getReviews() {
		return reviews;
	}


	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
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


	public Designation getDesignation() {
		return designation;
	}


	public void setDesignation(Designation designation) {
		this.designation = designation;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}




	public Set<Course> getCourses() {
		return courses;
	}


	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", designation=" + designation + ", password=" + password + ", courses=" + courses + "]";
	}


	
	
	
	
	
	




}
