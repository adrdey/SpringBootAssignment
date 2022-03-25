package com.assignment3.CourseManagementSystem.Services;

import java.util.List;
import java.util.Optional;

import com.assignment3.CourseManagementSystem.Entities.User;


public interface UserService {
	public List<User>getUsers();
	
	public Optional<User> getUser(int userId);
	
	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int userId);
}
