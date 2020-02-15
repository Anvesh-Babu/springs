package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Table(name="media")
public class Media {
      @Id
	 private Integer id;
	 private Integer userid;
	 @Column
	 private String title;
	 @Column
	 private String description;
	 @Column
	 private String mimetype;
	 @Column
	 private Integer size;
	 @Column
	 private String posterfileurl;
	 @Column
	 private String fileurl;
	 @Column
	 private String hide;
	 @Column @CreationTimestamp
	 private LocalDateTime createdon;
	 @Column @UpdateTimestamp
	 private LocalDateTime updateon;
	 @Column
	 private String tags;
	 
	 
	 
	public Media(Integer id, Integer userid, String title, String description, String mimetype, Integer size,
			String posterfileurl, String fileurl, String hide, LocalDateTime createdon, LocalDateTime updateon,
			String tags) {
		
		super();
		this.id = id;
		this.userid = userid;
		this.title = title;
		this.description = description;
		this.mimetype = mimetype;
		this.size = size;
		this.posterfileurl = posterfileurl;
		this.fileurl = fileurl;
		this.hide = hide;
		this.createdon = createdon;
		this.updateon = updateon;
		this.tags = tags;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMimetype() {
		return mimetype;
	}
	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getPosterfileurl() {
		return posterfileurl;
	}
	public void setPosterfileurl(String posterfileurl) {
		this.posterfileurl = posterfileurl;
	}
	public String getFileurl() {
		return fileurl;
	}
	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}
	public String getHide() {
		return hide;
	}
	public void setHide(String hide) {
		this.hide = hide;
	}
	public LocalDateTime getCreatedon() {
		return createdon;
	}
	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}
	public LocalDateTime getUpdateon() {
		return updateon;
	}
	public void setUpdateon(LocalDateTime updateon) {
		this.updateon = updateon;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Media [id=" + id + ", userid=" + userid + ", title=" + title + ", description=" + description
				+ ", mimetype=" + mimetype + ", size=" + size + ", posterfileurl=" + posterfileurl + ", fileurl="
				+ fileurl + ", hide=" + hide + ", createdon=" + createdon + ", updateon=" + updateon + ", tags=" + tags
				+ "]";
	}
	 
	 
	 
	 
}
