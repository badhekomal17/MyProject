package com.zensar.weatherclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class GetWeatherInformation {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "unknown")
	public String getWeather() {
		
		return restTemplate.getForEntity("http://localhost:9999/current/weather", String.class).getBody();
	}
	
	public String unknown() {
		return "unknown";
	}

}
