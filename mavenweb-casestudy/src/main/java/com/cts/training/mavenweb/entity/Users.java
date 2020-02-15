package com.cts.training.mavenweb.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Table(name="users")

public class Users {
	
	@Id
	private Integer id;
	@Column(name = "username")
	private String username;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private LocalDate dob;
	@Column
	private String profilepic;
	 @Column @CreationTimestamp
	private LocalDateTime createdon;
	@Column @UpdateTimestamp
	private LocalDateTime updateon;
	@Column
	private Boolean enabled;
	
    public Users() {}

	public Users(Integer id, String username, String password, String email, String firstname, String lastname,
			LocalDate dob, String profilepic, LocalDateTime createdon, LocalDateTime updateon, Boolean enabled) {
		
		
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.profilepic = profilepic;
		this.createdon = createdon;
		this.updateon = updateon;
		this.enabled = enabled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getProfilepic() {
		return profilepic;
	}

	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", profilepic=" + profilepic
				+ ", createdon=" + createdon + ", updateon=" + updateon + ", enabled=" + enabled + "]";
	}

	
	
	
	
}
