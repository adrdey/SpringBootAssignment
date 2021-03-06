package com.test.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
private int courseId;
private String courseName;
private String courseDuration;
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
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration + "]";
}


}
