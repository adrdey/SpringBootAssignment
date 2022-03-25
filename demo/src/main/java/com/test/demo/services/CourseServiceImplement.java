package com.test.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entities.Course;
import com.test.demo.repos.CourseDao;



@Service
public class CourseServiceImplement implements CourseService{

	@Autowired
	private CourseDao courseDao;
	@Override
	public List<Course> geCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Optional<Course> getCourse(int courseId) {
		// TODO Auto-generated method stub
		return courseDao.findById(courseId);
	}

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
	}

	@Override
	public void deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		Course entity = courseDao.getOne(courseId);
		 courseDao.delete(entity);
	}

}
