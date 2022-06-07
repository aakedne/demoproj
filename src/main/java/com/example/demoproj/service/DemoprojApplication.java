package com.example.demoproj.service;

import com.example.demoproj.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoprojApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoprojApplication.class, args);

		//Initialize the object
		Alien A1 = context.getBean(Alien.class);

		A1.code();
	}
}