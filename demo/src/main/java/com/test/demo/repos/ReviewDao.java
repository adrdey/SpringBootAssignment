package com.test.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entities.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review, Integer>{

}
