package com.test.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entities.Review;
import com.test.demo.repos.ReviewDao;



@Service
public class ReviewServiceImplement implements ReviewService{

	@Autowired
	private ReviewDao reviewDao;

	
		@Override
		public List<Review>getReviews() {
			// TODO Auto-generated method stub
			return reviewDao.findAll();
		}
		
		@Override
		public Optional<Review> getReview(int reviewId) {
			// TODO Auto-generated method stub
			return reviewDao.findById(reviewId);
		}
	@Override
	public void addReview(Review review) {
		// TODO Auto-generated method stub
		 reviewDao.save(review);
		
	}
	@Override
	public void updateReview(Review review) {
		// TODO Auto-generated method stub
		reviewDao.save(review);
		
	}
	@Override
	public void deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		Review entity = reviewDao.getOne(reviewId);
		 reviewDao.delete(entity);
		
	}

}

