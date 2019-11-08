package com.zensar.goodByeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class GoodByeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodByeServiceApplication.class, args);
	}
	
	@GetMapping
	public String sayGoodBye() {
		//return "<h1> Welcome to Microservices </h1>";
		return "<h1> Good Bye !!</h1>";
	}

}
