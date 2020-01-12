package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Activity")
public class UserActivity {
	private int activity_id;
	private String activity_name;
	private String description;
	private String creation_time;
	private String modified_by;
	private String modified_time;
	private int is_deleted;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="activity_id",nullable =false,length = 10)
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	@Column(name="activity_name",nullable = false,length = 10)
	public String getActivity_name() {
		return activity_name;
	}
	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}
	@Column(name="description",nullable = false,length = 30)
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
	@Column(name="modified_by",nullable = false,length = 20)
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
	@Column(name="is_deleted",nullable =false,length = 20)
	public int getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	@Override
	public String toString() {
		return "UserActivity [activity_id=" + activity_id + ", activity_name=" + activity_name + ", description="
				+ description + ", creation_time=" + creation_time + ", modified_by=" + modified_by + ", modified_time="
				+ modified_time + ", is_deleted=" + is_deleted + "]";
	}
	


}
