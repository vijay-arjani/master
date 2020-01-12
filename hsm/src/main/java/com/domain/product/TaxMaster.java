package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tax_master")
public class TaxMaster {

private int tax_code;
private int tax_value;
private String tax_name;
private String tax_varience;
@Column(name="tax_code",length = 255,nullable=false)
public int getTax_code() {
	return tax_code;
}
public void setTax_code(int tax_code) {
	this.tax_code = tax_code;
}
@Column(name="tax_value",length = 255,nullable=false)
public int getTax_value() {
	return tax_value;
}
public void setTax_value(int tax_value) {
	this.tax_value = tax_value;
}
@Column(name="tax_name",length = 255,nullable=false)
public String getTax_name() {
	return tax_name;
}
public void setTax_name(String tax_name) {
	this.tax_name = tax_name;
}
@Column(name="tax_varience",length = 255,nullable=false)
public String getTax_varience() {
	return tax_varience;
}
public void setTax_varience(String tax_varience) {
	this.tax_varience = tax_varience;
}

}
