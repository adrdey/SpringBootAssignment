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

import com.test.demo.entities.User;
import com.test.demo.services.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
private UserService userService;
	

	@GetMapping("/get")
	public List<User>getUsers(){
		return this.userService.getUsers();
	}
	
	@GetMapping("/get/{userId}")
	public Optional<User> getUser(@PathVariable int userId){
		return this.userService.getUser(userId);
				
	}
	
	@PostMapping("/add")
	public ResponseEntity<HttpStatus> addUser(@RequestBody User user){
		
		try {
			this.userService.addUser(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<HttpStatus> updateUser(@RequestBody User user){
		
		try {
			this.userService.updateUser(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable int userId){
		try {
			 this.userService.deleteUser(userId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
