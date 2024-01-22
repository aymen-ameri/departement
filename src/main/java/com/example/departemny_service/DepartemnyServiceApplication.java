package com.example.departemny_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartemnyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartemnyServiceApplication.class, args);
	}

}
