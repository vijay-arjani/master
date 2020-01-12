package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_type")
public class ProductType {

	private int pt_id;
	private String pt_name;
	private int size;
	private String description;
	private String uom;
	@Id
	@Column(name="pt_id",length = 255,nullable=false)
	public int getPt_id() {
		return pt_id;
	}
	public void setPt_id(int pt_id) {
		this.pt_id = pt_id;
	}
	@Column(name="pt_name",length = 255,nullable=false)
	public String getPt_name() {
		return pt_name;
	}
	public void setPt_name(String pt_name) {
		this.pt_name = pt_name;
	}
	@Column(name="size",length = 255,nullable=false)
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Column(name="description",length = 255,nullable=false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="uom",length = 255,nullable=false)
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}	
}
