package com.agribzar.ms_api_client; // Updated package declaration to align with standard naming conventions

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApiClientApplication.class, args);
		System.out.println("API-Gateway is running…");
	}

}