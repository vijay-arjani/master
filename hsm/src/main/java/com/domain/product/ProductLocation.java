package com.domain.product;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "product_location")
public class ProductLocation {
	int product_id;
	String location_code;
	String location_name;
	String description;
	String aisle;
	String bin;
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id",length = 255,nullable = false)
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	@Column(name="location_code",length = 255,nullable = false)
	public String getLocation_code() {
		return location_code;
	}

	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}
	@Column(name="location_name",length = 255,nullable = false)

	public String getLocation_name() {
		return location_name;
	}


	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	@Column(name="description",length = 255,nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="aisle",length = 255,nullable = false)
	public String getAisle() {
		return aisle;
	}

	public void setAisle(String aisle) {
		this.aisle = aisle;
	}
	@Column(name="bin",length = 255,nullable = false)
	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

}
