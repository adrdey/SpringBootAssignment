package com.assignment3.CourseManagementSystem.Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@Column(name = "course_id")
	private int courseId;
	
	private String courseName;
	
	private String courseDuration;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "course")
	private List<Review>reviews = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<User>users = new HashSet<>();
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Course(int courseId, String courseName, String courseDuration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		
	}


	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	

	public Set<User> getUsers() {
		return users;
	}


	public void setUsers(Set<User> users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", reviews=" + reviews + ", users=" + users + "]";
	}


	
	
	
	
	
	
	
}
