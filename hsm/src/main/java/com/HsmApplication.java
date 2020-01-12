package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import service.Card;
@SpringBootApplication
public class HsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsmApplication.class, args);
		// Card.save();
		// Card.delete();
		 //Card.getAllData();
		// Card.getDataById(10);
		//Card.updataData();

	}

}
