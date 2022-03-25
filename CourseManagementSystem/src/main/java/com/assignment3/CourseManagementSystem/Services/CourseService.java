package com.assignment3.CourseManagementSystem.Services;

import java.util.List;
import java.util.Optional;

import com.assignment3.CourseManagementSystem.Entities.Course;


public interface CourseService {
	public List<Course>geCourses();
	
	public Optional<Course> getCourse(int courseId);
	
	public void addCourse(Course course);

	public void updateCourse(Course course);

	public void deleteCourse(int courseId);
}
