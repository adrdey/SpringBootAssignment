package com.test.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Designation {
	@Id
private int designationId;
private String designation;
public Designation() {
	super();
	// TODO Auto-generated constructor stub
}
public Designation(int designationId, String designation) {
	super();
	this.designationId = designationId;
	this.designation = designation;
}
public int getDesignationId() {
	return designationId;
}
public void setDesignationId(int designationId) {
	this.designationId = designationId;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Designation [designationId=" + designationId + ", designation=" + designation + "]";
}



}
