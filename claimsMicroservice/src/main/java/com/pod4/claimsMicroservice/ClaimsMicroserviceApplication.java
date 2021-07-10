package com.pod4.claimsMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClaimsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimsMicroserviceApplication.class, args);
	}

}
