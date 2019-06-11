package com.sidharth.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerEurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerEurekaDemoApplication.class, args);
	}

}
