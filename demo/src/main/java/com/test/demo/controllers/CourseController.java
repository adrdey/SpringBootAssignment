package com.test.demo.controllers;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entities.Course;
import com.test.demo.services.CourseService;



@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;
		//get the Employee Details

		@GetMapping("/get")
		public List<Course>getCourses(){
			return this.courseService.geCourses();
		}
		
		@GetMapping("/get/{courseId}")
		public Optional<Course> getCourse(@PathVariable int courseId){
			return this.courseService.getCourse(courseId);
					
		}
		
		@PostMapping("/add")
		public ResponseEntity<HttpStatus> addCourse(@RequestBody Course course){
			
			try {
				this.courseService.addCourse(course);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@PutMapping("/update")
		public ResponseEntity<HttpStatus> updateCourse(@RequestBody Course course){
			
			try {
				this.courseService.updateCourse(course);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@DeleteMapping("/delete/{courseId}")
		public ResponseEntity<HttpStatus> deleteUser(@PathVariable int courseId){
			try {
				 this.courseService.deleteCourse(courseId);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
}

