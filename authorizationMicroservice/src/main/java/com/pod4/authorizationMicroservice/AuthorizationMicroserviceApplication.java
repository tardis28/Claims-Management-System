package com.pod4.authorizationMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class AuthorizationMicroserviceApplication {

	public static void main(String[] args) {
		log.debug("START");
		SpringApplication.run(AuthorizationMicroserviceApplication.class, args);
		log.debug("END");
	}

}