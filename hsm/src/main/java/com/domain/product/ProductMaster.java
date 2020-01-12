package com.domain.product;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "product_master")
public class ProductMaster {

	private int product_code;
	private String product_name;
	private String product_description1;
	private String product_description2;
	private String product_type;
	private String product_company;
	private int unit_price;
	private String product_location;
	private String aisle;
	private String bin;
	private int hsn_code;

	@Id
	@Column(name = "product_code", length = 255)
	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	@Column(name = "product_name", length = 255)
	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	@Column(name = "product_description1", length = 255)
	public String getProduct_description1() {
		return product_description1;
	}

	public void setProduct_description1(String product_description1) {
		this.product_description1 = product_description1;
	}

	@Column(name = "product_description2", length = 255)
	public String getProduct_description2() {
		return product_description2;
	}

	public void setProduct_description2(String product_description2) {
		this.product_description2 = product_description2;
	}

	@Column(name = "product_type", length = 255)
	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	@Column(name = "product_company", length = 255)
	public String getProduct_company() {
		return product_company;
	}

	public void setProduct_company(String product_company) {
		this.product_company = product_company;
	}

	@Column(name = "unit_price", length = 255)
	public int getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}

	@Column(name = "product_location", length = 255)
	public String getProduct_location() {
		return product_location;
	}

	public void setProduct_location(String product_location) {
		this.product_location = product_location;
	}

	@Column(name = "aisle", length = 255)
	public String getAisle() {
		return aisle;
	}

	public void setAisle(String aisle) {
		this.aisle = aisle;
	}

	@Column(name = "bin", length = 255)
	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	@Column(name = "hsn_code", length = 255)
	public int getHsn_code() {
		return hsn_code;
	}

	public void setHsn_code(int hsn_code) {
		this.hsn_code = hsn_code;
	}

}
