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

import com.test.demo.entities.Review;
import com.test.demo.services.ReviewService;



@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	

		@GetMapping("/get")
		public List<Review>geReviews(){
			return this.reviewService.getReviews();
		}
		
		@GetMapping("/get/{reviewId}")
		public Optional<Review> getReview(@PathVariable int reviewId){
			return this.reviewService.getReview(reviewId);
					
		}
		
		@PostMapping("/add")
		public ResponseEntity<HttpStatus> addReview(@RequestBody Review review){
			
			try {
				this.reviewService.addReview(review);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@PutMapping("/update")
		public ResponseEntity<HttpStatus> updateReview(@RequestBody Review review){
			
			try {
				this.reviewService.updateReview(review);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@DeleteMapping("/delete/{reviewId}")
		public ResponseEntity<HttpStatus> deleteReview(@PathVariable int reviewId){
			try {
				 this.reviewService.deleteReview(reviewId);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
}
