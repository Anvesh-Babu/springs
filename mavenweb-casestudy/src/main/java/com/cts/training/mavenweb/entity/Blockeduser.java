package com.cts.training.mavenweb.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="blockeduser")
public class Blockeduser {
      @Id
	 private Integer userId;
	 private Integer BlockeduserId;
	 
	public Blockeduser(Integer userId, Integer blockeduserId) {
		super();
		this.userId = userId;
		BlockeduserId = blockeduserId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBlockeduserId() {
		return BlockeduserId;
	}

	public void setBlockeduserId(Integer blockeduserId) {
		BlockeduserId = blockeduserId;
	}

	@Override
	public String toString() {
		return "Blockeduser [userId=" + userId + ", BlockeduserId=" + BlockeduserId + "]";
	}
	 
	 
}
