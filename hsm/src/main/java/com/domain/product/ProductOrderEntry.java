package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_order_entry")
public class ProductOrderEntry {
	private int order_id;
	private int product_code;
	private int package_code;
	private int unit_price;
	private int qty;
	private int size;
	private int uom;
	private String  status;
	private String order_date;
	private int tatal_qty;
	private int total_price;
	@Id
	@Column(name = "order_id", length = 255, nullable = false)
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	@Column(name = "product_code", length = 255, nullable = false)
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	@Column(name = "package_code", length = 255, nullable = false)
	public int getPackage_code() {
		return package_code;
	}
	public void setPackage_code(int package_code) {
		this.package_code = package_code;
	}
	@Column(name = "unit_price", length = 255, nullable = false)
	public int getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}
	@Column(name = "qty", length = 255, nullable = false)
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Column(name = "size", length = 255, nullable = false)
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Column(name = "uom", length = 255, nullable = false)
	public int getUom() {
		return uom;
	}
	public void setUom(int uom) {
		this.uom = uom;
	}
	@Column(name = "status", length = 255, nullable = false)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name = "order_date", length = 255, nullable = false)
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	@Column(name = "tatal_qty", length = 255, nullable = false)
	public int getTatal_qty() {
		return tatal_qty;
	}
	public void setTatal_qty(int tatal_qty) {
		this.tatal_qty = tatal_qty;
	}
	@Column(name = "total_price", length = 255, nullable = false)
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	
}
