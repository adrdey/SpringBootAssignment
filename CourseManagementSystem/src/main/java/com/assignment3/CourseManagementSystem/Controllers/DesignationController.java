package com.assignment3.CourseManagementSystem.Controllers;

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

import com.assignment3.CourseManagementSystem.Entities.Designation;
import com.assignment3.CourseManagementSystem.Services.DesignationService;



@RestController
@RequestMapping("/designation")
public class DesignationController {
	@Autowired
	private DesignationService designationService;
	

		@GetMapping("/get")
		public List<Designation>getDesignations(){
			return this.designationService.getDesignations();
		}
		
		@GetMapping("/get/{designationId}")
		public Optional<Designation> getDesignation(@PathVariable int designationId){
			return this.designationService.getDesignation(designationId);
					
		}
		
		@PostMapping("/add")
		public ResponseEntity<HttpStatus> addDesignation(@RequestBody Designation designation){
			
			try {
				this.designationService.addDesignation(designation);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@PutMapping("/update")
		public ResponseEntity<HttpStatus> updateDesignation(@RequestBody Designation designation){
			
			try {
				this.designationService.updateDesignation(designation);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@DeleteMapping("/delete/{designationId}")
		public ResponseEntity<HttpStatus> deleteUser(@PathVariable int designationId){
			try {
				 this.designationService.deleteDesignation(designationId);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
}
