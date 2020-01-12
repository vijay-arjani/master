package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyMaster {

	private int c_id; 
	private String c_name;
	private String description;
	private String city;
	private  String state;
	private String country;
	private String gst_no;
	private String cin_no;
	private String  add_1;
	private String add_2;
	private String add_3;
	private String pincode;
	private String contact_no;
	private String email_id;
	@Id
	@Column(name="c_id",nullable= false,length = 255 )
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@Column(name="c_name",nullable= false,length = 255 )
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Column(name="description",nullable= false,length = 255 )
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="city",nullable= false,length = 255 )
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="state",nullable= false,length = 255 )
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name="country",nullable= false,length = 255 )
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name="gst_no",nullable= false,length = 255 )
	public String getGst_no() {
		return gst_no;
	}
	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}
	@Column(name="cin_no",nullable= false,length = 255 )
	public String getCin_no() {
		return cin_no;
	}
	public void setCin_no(String cin_no) {
		this.cin_no = cin_no;
	}
	@Column(name="add_1",nullable= false,length = 255 )
	public String getAdd_1() {
		return add_1;
	}
	public void setAdd_1(String add_1) {
		this.add_1 = add_1;
	}
	@Column(name="add_2",nullable= false,length = 255 )
	public String getAdd_2() {
		return add_2;
	}
	public void setAdd_2(String add_2) {
		this.add_2 = add_2;
	}
	@Column(name="add_3",nullable= false,length = 255 )
	public String getAdd_3() {
		return add_3;
	}
	public void setAdd_3(String add_3) {
		this.add_3 = add_3;
	}
	@Column(name="pincode",nullable= false,length = 255 )
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Column(name="contact_no",nullable= false,length = 255 )
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	@Column(name="email_id",nullable= false,length = 255 )
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
}

