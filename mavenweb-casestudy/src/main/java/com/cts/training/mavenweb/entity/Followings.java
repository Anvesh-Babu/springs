package com.cts.training.mavenweb.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="followings")
public class Followings {
	
	  @Id
	private Integer userId;
	private Integer followerId;
	
	
	public Followings(Integer userId, Integer followerId) {
		super();
		this.userId = userId;
		this.followerId = followerId;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getFollowerId() {
		return followerId;
	}


	public void setFollowerId(Integer followerId) {
		this.followerId = followerId;
	}


	@Override
	public String toString() {
		return "Followings [userId=" + userId + ", followerId=" + followerId + "]";
	}


		
     
	
}
