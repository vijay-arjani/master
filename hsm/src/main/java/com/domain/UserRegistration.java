package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_Registration")
public class UserRegistration {
	private int id;
	private String first_name;
	private String last_name;
	private String adhaar_number;
	private String email;
	private long mobile;
	private String country;
	private String city;
	private long pincode;
	private String occupation;
	private String creation_time;
	private String modified_by;
	private String modified_time;
	private int is_delete;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable = false,length = 15)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="firstName",nullable = false,length = 50)
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	@Column(name="lastName",nullable = false,length = 50)
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	@Column(name="adhaarNumber",nullable = false,length = 16)
	public String getAdhaar_number() {
		return adhaar_number;
	}
	public void setAdhaar_number(String adhaar_number) {
		this.adhaar_number = adhaar_number;
	}
	@Column(name="email",nullable = false,length = 30)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="mobile",nullable = false,length = 10)
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Column(name="country",nullable = false,length = 20)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name="city",nullable =false,length =15)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="pincode",nullable = false,length = 15)
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Column(name="occupation",nullable = false,length = 15)
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	@Column(name="creationTime",nullable = false,length = 25)
	public String getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}
	@Column(name="modified_by",nullable = false,length = 18)
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
	@Column(name="isDelete",nullable = false,length = 2)
	public int getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}
	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", adhaar_number=" + adhaar_number + ", email=" + email + ", mobile=" + mobile + ", country="
				+ country + ", city=" + city + ", pincode=" + pincode + ", occupation=" + occupation
				+ ", creation_time=" + creation_time + ", modified_by=" + modified_by + ", modified_time="
				+ modified_time + ", is_delete=" + is_delete + "]";
	}
	
	
	
	

}
