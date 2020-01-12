package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "package_master")
public class PackageMaster {
	private int package_code;
	private int package_item_contain;
	private String package_name;
	private String description;
	private int product_code;
	private int carton_code;
	private int qty_contain;

	private int package_price;
	private int hsn_code;

	@Id
	@Column(name = "package_code", length = 255, nullable = false)
	public int getPackage_code() {
		return package_code;
	}

	public void setPackage_code(int package_code) {
		this.package_code = package_code;
	}

	@Column(name = "package_item_contain", length = 255, nullable = false)
	public int getPackage_item_contain() {
		return package_item_contain;
	}

	public void setPackage_item_contain(int package_item_contain) {
		this.package_item_contain = package_item_contain;
	}

	@Column(name = "package_name", length = 255, nullable = false)

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	@Column(name = "description", length = 255, nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "product_code", length = 255, nullable = false)
	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	@Column(name = "carton_code", length = 255, nullable = false)
	public int getCarton_code() {
		return carton_code;
	}

	public void setCarton_code(int carton_code) {
		this.carton_code = carton_code;
	}

	@Column(name = "qty_contain", length = 255, nullable = false)
	public int getQty_contain() {
		return qty_contain;
	}

	public void setQty_contain(int qty_contain) {
		this.qty_contain = qty_contain;
	}

	@Column(name = "package_price", length = 255, nullable = false)
	public int getPackage_price() {
		return package_price;
	}

	public void setPackage_price(int package_price) {
		this.package_price = package_price;
	}

	@Column(name = "hsn_code", length = 255, nullable = false)
	public int getHsn_code() {
		return hsn_code;
	}

	public void setHsn_code(int hsn_code) {
	}

}
