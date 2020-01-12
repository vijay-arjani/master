package com.domain.shopDepartment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop {
	private int id;
	private String s_name;
	private String owner_name;
	private String owner_number;
	private String email;
	private String aadhar_number;
	private String gst;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "s_id", length = 215)

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "s_name", length = 215)
	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	@Column(name = "owner_name", length = 215)
	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	@Column(name = "owner_number", length = 215)
	public String getOwner_number() {
		return owner_number;
	}

	public void setOwner_number(String owner_number) {
		this.owner_number = owner_number;
	}

	@Column(name = "email", length = 215)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "aadhar_number", length = 215)
	public String getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

	@Column(name = "gst", length = 215)
	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}
}
