package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_status")
public class Order_Status {

	private int os_id;
	private String os_name;
	private String description;

	@Column(name = "os_id", length = 15, nullable = false)
	public int getOs_id() {
		return os_id;
	}

	public void setOs_id(int os_id) {
		this.os_id = os_id;
	}

	@Column(name = "os_name", length = 255, nullable = false)
	public String getOs_name() {
		return os_name;
	}

	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}

	@Column(name = "description", length = 255, nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
