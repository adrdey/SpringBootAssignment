package com.assignment3.CourseManagementSystem.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment3.CourseManagementSystem.Entities.User;
import com.assignment3.CourseManagementSystem.Repositories.UserDao;


@Service
public class UserServiceImplement implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public List<User> getUsers() {
		
		return userDao.findAll();
	}

	@Override
	public Optional<User> getUser(int userId) {
		
		return userDao.findById(userId);
	}

	@Override
	public void addUser(User user) {
		
		 userDao.save(user);
	}

	@Override
	public void updateUser(User user) {
	
		 userDao.save(user);
	}

	@Override
	public void deleteUser(int userId) {
	
		User entity = userDao.getOne(userId);
		 userDao.delete(entity);
		
	}

}
