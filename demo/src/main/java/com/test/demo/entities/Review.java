package com.test.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Review {
@Id
private int reviewId;
private String review;
private String course;
private String user;
public Review() {
	super();
	// TODO Auto-generated constructor stub
}
public Review(int reviewId, String review, String course, String user) {
	super();
	this.reviewId = reviewId;
	this.review = review;
	this.course = course;
	this.user = user;
}
public int getReviewId() {
	return reviewId;
}
public void setReviewId(int reviewId) {
	this.reviewId = reviewId;
}
public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
@Override
public String toString() {
	return "Review [reviewId=" + reviewId + ", review=" + review + ", course=" + course + ", user=" + user + "]";
}


}
