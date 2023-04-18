package com.sonata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SuggestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuggestionServiceApplication.class, args);
	}

}
