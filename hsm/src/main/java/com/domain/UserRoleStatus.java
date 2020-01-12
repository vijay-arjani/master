package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Role_Status")
public class UserRoleStatus {
	private int id;
	private String status_type;
	private String descriptions;
	private int is_deleted;
	private String creation_time;
	private String modified_by;
	private String modified_time;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable = false,length = 20)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="status_type",nullable = false,length = 20)
	public String getStatus_type() {
		return status_type;
	}
	public void setStatus_type(String status_type) {
		this.status_type = status_type;
	}
	@Column(name="descriptions",nullable = false,length = 50)
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	@Column(name="isDeleted",nullable = false,length = 25)
	public int getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	@Column(name="creationTime",nullable = false,length = 25)
	public String getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}
	@Column(name="modifiedBy",nullable = false,length = 25)
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	@Column(name="modifiedTime",nullable = false,length = 25)
	public String getModified_time() {
		return modified_time;
	}
	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}
	@Override
	public String toString() {
		return "UserRoleStatus [id=" + id + ", status_type=" + status_type + ", descriptions=" + descriptions
				+ ", is_deleted=" + is_deleted + ", creation_time=" + creation_time + ", modified_by=" + modified_by
				+ ", modified_time=" + modified_time + "]";
	}
	
	
}
