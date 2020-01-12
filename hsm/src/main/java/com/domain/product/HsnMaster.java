package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hsn_master")
public class HsnMaster {
	@Id
	@Column(name="hsn_code",length = 255,nullable=false)
	public int getHsn_code() {
		return hsn_code;
	}

	public void setHsn_code(int hsn_code) {
		this.hsn_code = hsn_code;
	}
	@Column(name="hsn_rate",length = 255,nullable=false)

	public int getHsn_rate() {
		return hsn_rate;
	}

	public void setHsn_rate(int hsn_rate) {
		this.hsn_rate = hsn_rate;
	}

	public String getDescription() {
		return description;
	}
	@Column(name="description",length = 255,nullable=false)
	public void setDescription(String description) {
		this.description = description;
	}

	private int hsn_code;
	private int hsn_rate;
	private String description;

}
