package com.cts.training.mavenweb.entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Table;
@Table(name="newsfeed")
public class Newsfeed {
	 @Id
	 private Integer Id;
	 private Integer userId;
	 private Integer mediaId;
	 @Column
	 private String feed;
	 @CreationTimestamp
	 private LocalDateTime createdon;
	 
	 
	public Newsfeed(Integer id, Integer userId, Integer mediaId, String feed, LocalDateTime createdon) {
		super();
		Id = id;
		this.userId = userId;
		this.mediaId = mediaId;
		this.feed = feed;
		this.createdon = createdon;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getMediaId() {
		return mediaId;
	}


	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}


	public String getFeed() {
		return feed;
	}


	public void setFeed(String feed) {
		this.feed = feed;
	}


	public LocalDateTime getCreatedon() {
		return createdon;
	}


	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}


	@Override
	public String toString() {
		return "Newsfeed [Id=" + Id + ", userId=" + userId + ", mediaId=" + mediaId + ", feed=" + feed + ", createdon="
				+ createdon + "]";
	}
	 

}
