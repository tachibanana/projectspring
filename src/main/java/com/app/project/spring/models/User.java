package com.app.project.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	private String username;
	private String password;
	
	public User(){
		super();
	}
	
	public User(int id, String username, String password, String accessType, String email, boolean isActivated) {
		this();
		this.id = id;
		this.username = username;
		this.password = password;
		this.accessType = accessType;
		this.email = email;
		this.isActivated = isActivated;
	}

	@Column(name="access_type")
	private String accessType;
	private String email;
	
	@Column(name="is_activated")
	private boolean isActivated;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
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
	
	public String getAccessType() {
		return accessType;
	}
	
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isActivated() {
		return isActivated;
	}
	
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", accessType=" 
				+ accessType + ", email=" + email + ", isActivated=" + isActivated + "]";
	}
	
}
