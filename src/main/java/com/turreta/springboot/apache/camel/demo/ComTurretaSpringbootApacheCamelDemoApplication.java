package com.turreta.springboot.apache.camel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ComTurretaSpringbootApacheCamelDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComTurretaSpringbootApacheCamelDemoApplication.class, args);

		try {
			// Sleep for 5 minutes
			TimeUnit.MINUTES.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
