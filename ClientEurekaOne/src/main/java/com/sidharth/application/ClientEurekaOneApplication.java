package com.sidharth.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientEurekaOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientEurekaOneApplication.class, args);
	}

}
