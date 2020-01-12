package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserLogin")
public class UserLogin {
	private int user_id;
	private String username;
	private String password;
	private String default_role_id;
	private String is_deleted;
	private String creation_time;
	private String modified_by;
	private String modified_time;
	@Id
	@Column(name="user_id",nullable = false,length = 25)
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Column(name="username",nullable = false,length = 25)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="password",nullable = false,length = 25)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="default_role_id",length = 25)
	public String getDefault_role_id() {
		return default_role_id;
	}
	public void setDefault_role_id(String default_role_id) {
		this.default_role_id = default_role_id;
	}
	@Column(name="is_deleted",length = 25)
	public String getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(String is_deleted) {
		this.is_deleted = is_deleted;
	}
	@Column(name="creation_time",length = 25)
	public String getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}
	@Column(name="modified_by",length = 25)
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	@Column(name="modified_time",length = 25)
	public String getModified_time() {
		return modified_time;
	}
	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}

}
