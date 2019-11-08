package com.zensar.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {
	
	@Autowired
	EurekaClient client;
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	@GetMapping
	public String getMessage()
	{
		RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo info = client.getNextServerFromEureka("service",false);
		
		String homePageUrl = info.getHomePageUrl();
		ResponseEntity<String> exchange = restTemplate.exchange(homePageUrl,HttpMethod.GET,null,String.class,0);
		return exchange.getBody();
	}

}
