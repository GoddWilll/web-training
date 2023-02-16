package com.websitetraining.webtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // lets the app know that this class is a controller
public class WebTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTrainingApplication.class, args);
	}

}
