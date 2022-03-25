package com.assignment3.CourseManagementSystem.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "review_id")
	private int reviewId;

	private String review;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private String course;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(int reviewId, String review, String course, User user) {
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", review=" + review + ", course=" + course + ", user=" + user + "]";
	}
	
	
	
}
