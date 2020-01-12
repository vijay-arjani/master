package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

@Entity
@Table(name = "Country_Master")
public class CountryMaster {
	int country_code;
	String country_name;
	String description;
	String conuntry_continent;
	@Id 

	@Column(name="country_code",length = 255,nullable = false)
	public int getCountry_code() {
		return country_code;
	}
	public void setCountry_code(int country_code) {
		this.country_code = country_code;
	}
	@Column(name="country_name",length = 255,nullable = false)
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	@Column(name="description",length = 255,nullable = false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="conuntry_continent",length = 255,nullable = false)
	public String getConuntry_continent() {
		return conuntry_continent;
	}
	public void setConuntry_continent(String conuntry_continent) {
		this.conuntry_continent = conuntry_continent;
	}

}
