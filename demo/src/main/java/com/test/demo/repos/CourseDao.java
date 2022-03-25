package com.test.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer>{

}
