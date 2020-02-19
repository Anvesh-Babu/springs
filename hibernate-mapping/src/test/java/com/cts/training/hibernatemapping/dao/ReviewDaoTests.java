package com.cts.training.hibernatemapping.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.training.hibernatemapping.HibernateMappingApplication;
import com.cts.training.hibernatemapping.entity.Course;
import com.cts.training.hibernatemapping.entity.Review;

@RunWith(SpringRunner.class) // Test Runner
@SpringBootTest(classes =  HibernateMappingApplication.class )
public class ReviewDaoTests {
  
	
	@Autowired
	private CourseDao courseDao;
	
	
	@Autowired
	private ReviewDao reviewDao;
	
	
	@Test
	public void AddReviewAndCourse() {
		
		Review review=new Review();
		review.setReview("Good");
	 
		Course course = new Course();
		course.setName("angular");
		
		
		Review added = this.reviewDao.addReviewAndCourse(review, course);
		assertEquals("angular", added.getCourse().getName());
		
	}
	
	
	
	@Test
	public void AddReviewToExistingCourse() {
	  Course course = this.courseDao.findById(2);
	  Review review = new Review();
	  review.setReview("good");
	  Review added =this.reviewDao.addReviewtoExistingCourse(review, course);
	  assertEquals("angular", added.getCourse().getName());	  
		
	}
	
}
