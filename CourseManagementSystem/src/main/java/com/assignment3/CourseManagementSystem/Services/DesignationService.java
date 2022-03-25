package com.assignment3.CourseManagementSystem.Services;

import java.util.List;
import java.util.Optional;

import com.assignment3.CourseManagementSystem.Entities.Designation;


public interface DesignationService {
	public List<Designation>getDesignations();
	
	public Optional<Designation> getDesignation(int designationId);
	
	public void addDesignation(Designation designation);

	public void updateDesignation(Designation designation);

	public void deleteDesignation(int designationId);
}
