package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city_master")

public class CityMaster {

	int city_code;
	String city_name;
	String description;
	String state_code;
	@Id
	@Column(name="city_code",nullable= false,length = 255 )
	public int getCity_code() {
		return city_code;
	}
	
	public void setCity_code(int city_code) {
		this.city_code = city_code;
	}
	@Column(name="city_name",nullable= false,length = 255 )
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	@Column(name="description",nullable= false,length = 255 )
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="state_code",nullable= false,length = 255 )
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	
}
