package com.TroubleShooters.AcciAlert_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.TroubleShooters.AcciAlert_server.model")
public class AcciAlertServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcciAlertServerApplication.class, args);
	}

}
