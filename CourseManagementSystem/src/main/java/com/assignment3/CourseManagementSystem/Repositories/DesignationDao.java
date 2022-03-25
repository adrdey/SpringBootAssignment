package com.assignment3.CourseManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment3.CourseManagementSystem.Entities.Designation;

@Repository
public interface DesignationDao extends JpaRepository<Designation, Integer>{

}
