package com.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "carton_master")
public class CartonMaster {
	private int carton_code;
	private int carton_height;
	private int carton_lenth;
	private int carton_width;

	@Column(name = "carton_code", length = 255, nullable = false)
	public int getCarton_code() {
		return carton_code;
	}

	public void setCarton_code(int carton_code) {
		this.carton_code = carton_code;
	}

	@Column(name = "carton_height", length = 255, nullable = false)
	public int getCarton_height() {
		return carton_height;
	}

	public void setCarton_height(int carton_height) {
		this.carton_height = carton_height;
	}

	@Column(name = "carton_lenth", length = 255, nullable = false)
	public int getCarton_lenth() {
		return carton_lenth;
	}

	public void setCarton_lenth(int carton_lenth) {
		this.carton_lenth = carton_lenth;
	}

	@Column(name = "carton_width", length = 255, nullable = false)
	public int getCarton_width() {
		return carton_width;
	}

	public void setCarton_width(int carton_width) {
		this.carton_width = carton_width;
	}

}
