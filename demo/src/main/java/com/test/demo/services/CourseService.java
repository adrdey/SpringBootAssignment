package com.test.demo.services;

import java.util.List;
import java.util.Optional;

import com.test.demo.entities.Course;



public interface CourseService {
	public List<Course>geCourses();
	
	public Optional<Course> getCourse(int courseId);
	
	public void addCourse(Course course);

	public void updateCourse(Course course);

	public void deleteCourse(int courseId);
}
