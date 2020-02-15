package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Table(name="actions")
public class Actions {
	@Id
	private Integer Id ;
	private Integer mediaId;
	private Integer userId;
	@Column
	private boolean Status;
     @Column @CreationTimestamp
	private LocalDateTime createdon;
	
	
	
	public Actions(Integer id, Integer mediaId, Integer userId, boolean status, LocalDateTime createdon) {
		super();
		Id = id;
		this.mediaId = mediaId;
		this.userId = userId;
		Status = status;
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



	public boolean isStatus() {
		return Status;
	}



	public void setStatus(boolean status) {
		Status = status;
	}



	public LocalDateTime getCreatedon() {
		return createdon;
	}



	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}



	@Override
	public String toString() {
		return "Actions [Id=" + Id + ", mediaId=" + mediaId + ", userId=" + userId + ", Status=" + Status
				+ ", createdon=" + createdon + "]";
	}
	
	
	
	
	

}
