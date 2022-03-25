package com.test.demo.services;

import java.util.List;
import java.util.Optional;

import com.test.demo.entities.Review;



public interface ReviewService {
	
	public List<Review>getReviews();
	
	public Optional<Review> getReview(int reviewId);
	
	public void addReview(Review review);

	public void updateReview(Review review);

	public void deleteReview(int reviewId);
}