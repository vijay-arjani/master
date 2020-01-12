package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role_assigned")
public class UserRoleAssigned {
	private int id;
	private int user_id;
	private int role_id;
	private String start_date;
	private String end_date;
	private String status_id;
	private String creation_time;
	private String modified_time;
	private String modifird_by;
	private String is_delete;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, length = 10)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "user_id", nullable = false, length = 25)
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Column(name = "role_id", nullable = false, length = 10)
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	@Column(name = "start_date", nullable = false, length = 20)
	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;

	}

	@Column(name="end_date",nullable = false,length = 14)
	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	@Column(name="status_id",nullable = false,length = 15)
	public String getStatus_id() {
		return status_id;
	}

	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}
	@Column(name="creation_time",nullable = false,length = 25)
	public String getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}

	@Column(name="modified_time",nullable = false,length = 12)
	public String getModified_time() {
		return modified_time;
	}

	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}
	@Column(name="modifird_by",nullable = false,length = 25)
	public String getModifird_by() {
		return modifird_by;
	}

	public void setModifird_by(String modifird_by) {
		this.modifird_by = modifird_by;
	}
	@Column(name="is_delete",nullable = false,length = 3)
	public String getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}

	@Override
	public String toString() {
		return "UserRoleAssigned [id=" + id + ", user_id=" + user_id + ", role_id=" + role_id + ", start_date="
				+ start_date + ", end_date=" + end_date + ", status_id=" + status_id + ", creation_time="
				+ creation_time + ", modified_time=" + modified_time + ", modifird_by=" + modifird_by + ", is_delete="
				+ is_delete + "]";
	}

}
