package com.sonata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AdminLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminLoginApplication.class, args);
	}

}
