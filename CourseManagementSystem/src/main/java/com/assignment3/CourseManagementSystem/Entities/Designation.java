package com.assignment3.CourseManagementSystem.Entities;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Designation {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "designation_id")
	private int designationid;

	private String designation;
	
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "designation")
	@JsonBackReference
	private User user;
	
	
	public Designation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Designation(int designationid, String designation, User user) {
		super();
		this.designationid = designationid;
		this.designation = designation;
		this.user = user;
	}


	public int getDesignationid() {
		return designationid;
	}


	public void setDesignationid(int designationid) {
		this.designationid = designationid;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public User getUsers() {
		return user;
	}


	public void setUsers(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Designation [designationid=" + designationid + ", designation=" + designation + ", user=" + user
				+ "]";
	}


	
	
	
	
	
	
	
}
