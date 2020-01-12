package com.domain.product;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "uom_master")

public class UomMaster {
	private int umo_code;
	private String umo_name;
	private String description;
	@Id
	@Column(name="umo_code",length = 255,nullable=false)
	public int getUmo_code() {
		return umo_code;
	}
	public void setUmo_code(int umo_code) {
		this.umo_code = umo_code;
	}
	@Column(name="umo_name",length = 255,nullable=false)
	public String getUmo_name() {
		return umo_name;
	}
	public void setUmo_name(String umo_name) {
		this.umo_name = umo_name;
	}
	@Column(name="description",length = 255,nullable=false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
