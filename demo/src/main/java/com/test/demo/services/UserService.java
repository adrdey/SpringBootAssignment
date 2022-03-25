package com.test.demo.services;

import java.util.List;
import java.util.Optional;

import com.test.demo.entities.User;



public interface UserService {
	public List<User>getUsers();
	
	public Optional<User> getUser(int userId);
	
	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int userId);
}
