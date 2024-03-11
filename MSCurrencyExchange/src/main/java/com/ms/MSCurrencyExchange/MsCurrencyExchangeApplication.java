package com.ms.MSCurrencyExchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MsCurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCurrencyExchangeApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate template()
	{
		return new RestTemplate();
	}
}
