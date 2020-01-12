package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Activity_Log")
public class UserActivityLog {

	private int log_id;
	private int user_id;
	private int activity_id;
	private String ip_address;
	private String date_time;
	private String description;
	private String creation_time;
	private String modified_by;
	private String modified_time;
	private int is_deleted;
	@Id
	@Column(name="log_id",nullable = false,length = 25)
	public int getLog_id() {
		return log_id;
	}
	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
	@Column(name="user_id",nullable = false,length = 25)
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Column(name="activity_id",nullable = false,length = 20)
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	@Column(name="ip_address",nullable = false,length = 20)
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	@Column(name="date_time",nullable = false,length = 25)
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	@Column(name="description",nullable = false,length = 25)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="creation_time",nullable = false,length = 25)
	public String getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}
	@Column(name="modified_by",nullable = false,length = 14)
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	@Column(name="modified_time",nullable = false,length = 25)
	public String getModified_time() {
		return modified_time;
	}
	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}
	@Column(name="is_deleted",nullable = false,length = 25)
	public int getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	@Override
	public String toString() {
		return "UserActivityLog [log_id=" + log_id + ", user_id=" + user_id + ", activity_id=" + activity_id
				+ ", ip_address=" + ip_address + ", date_time=" + date_time + ", description=" + description
				+ ", creation_time=" + creation_time + ", modified_by=" + modified_by + ", modified_time="
				+ modified_time + ", is_deleted=" + is_deleted + "]";
	}
	

}
