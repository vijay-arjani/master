package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "user_role")
public class UserRole {

	private int id;
	private String role_name;
	private String description;
	private int is_deleted;
	private String creation_time;
	private String modified_by;
	private String modified_time;
	public UserRole() {
		// TODO Auto-generated constructor stub
	}
	
	public UserRole(int id){
		this.id=id;
		
	}

	public UserRole( String role_name, String description, int is_deleted, String creation_time,
			String modified_by, String modified_time) {
		
		this.role_name = role_name;
		this.description = description;
		this.is_deleted = is_deleted;
		this.creation_time = creation_time;
		this.modified_by = modified_by;
		this.modified_time = modified_time;

	}

	@Column(name = "modified_time", nullable = false, length = 255)
	public String getModified_time() {
		return modified_time;
	}

	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false, length = 10)
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "role_name", nullable = false, length = 20)
	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	@Column(name = "description", nullable = false, length = 30)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "isdeleted", nullable = false, length = 10)
	public int getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}

	@Column(name = "creation_time", nullable = false, length = 10)
	public String getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}

	@Column(name = "modified_by", nullable = false, length = 10)

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	@Override
	public String toString() {
		return "UserRole [id=" + id + ", role_name=" + role_name + ", description=" + description + ", is_deleted="
				+ is_deleted + ", creation_time=" + creation_time + ", modified_by=" + modified_by + ", modified_time="
				+ modified_time + "]";
	}

}
