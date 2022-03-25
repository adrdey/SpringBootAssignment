package com.assignment3.CourseManagementSystem.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment3.CourseManagementSystem.Entities.Designation;
import com.assignment3.CourseManagementSystem.Repositories.DesignationDao;

@Service
public class DesignationServiceImplement implements DesignationService{
	@Autowired
	private DesignationDao designationDao;

	@Override
	public List<Designation> getDesignations() {
		// TODO Auto-generated method stub
		return designationDao.findAll();
	}

	@Override
	public Optional<Designation> getDesignation(int designationId) {
		// TODO Auto-generated method stub
		return designationDao.findById(designationId);
	}

	@Override
	public void addDesignation(Designation designation) {
		// TODO Auto-generated method stub
		designationDao.save(designation);
		
	}

	@Override
	public void updateDesignation(Designation designation) {
		// TODO Auto-generated method stub
		designationDao.save(designation);
	}

	@Override
	public void deleteDesignation(int designationId) {
		// TODO Auto-generated method stub
		Designation entity = designationDao.getOne(designationId);
		 designationDao.delete(entity);
		
	}
	

}
