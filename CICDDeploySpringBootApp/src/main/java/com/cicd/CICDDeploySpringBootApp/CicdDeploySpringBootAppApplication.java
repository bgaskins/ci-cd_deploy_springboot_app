package com.cicd.CICDDeploySpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDeploySpringBootAppApplication {
	
	@GetMapping("/")
	public String home() {
		return "Hello World! CI/CD SpringBoot App Deployed...";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdDeploySpringBootAppApplication.class, args);
	}

}