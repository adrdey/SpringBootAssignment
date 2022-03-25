package com.assignment3.CourseManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment3.CourseManagementSystem.Entities.User;
@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
