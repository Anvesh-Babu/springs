package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
@Table(name="comments")
public class Comments {
        @javax.persistence.Id
	 private Integer Id;
	 private Integer mediaId;
	 private Integer userId;
	 @Column
	 private String comment;
	 @CreationTimestamp
	 private LocalDateTime createdon;
	 
	 
	 
	public Comments(Integer id, Integer mediaId, Integer userId, String comment, LocalDateTime createdon) {
		super();
		Id = id;
		this.mediaId = mediaId;
		this.userId = userId;
		this.comment = comment;
		this.createdon = createdon;
	}



	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}



	public Integer getMediaId() {
		return mediaId;
	}



	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}



	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public LocalDateTime getCreatedon() {
		return createdon;
	}



	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}



	@Override
	public String toString() {
		return "Comments [Id=" + Id + ", mediaId=" + mediaId + ", userId=" + userId + ", comment=" + comment
				+ ", createdon=" + createdon + "]";
	} 
	 
	
	
	
}
