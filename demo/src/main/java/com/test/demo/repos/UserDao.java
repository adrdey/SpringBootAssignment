package com.test.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
