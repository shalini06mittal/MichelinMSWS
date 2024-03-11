package com.ms.MSForeignExchange;

import com.ms.MSForeignExchange.entity.Currency;
import com.ms.MSForeignExchange.repo.CurrencyRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsForeignExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsForeignExchangeApplication.class, args);
	}

	@Autowired
	private CurrencyRepo currencyRepo;
	@PostConstruct
	public void initialize(){
		currencyRepo.save(new Currency(1L,"USD","INR", 80.0));
		currencyRepo.save(new Currency(2L,"SGP","INR", 50.0));
		currencyRepo.save(new Currency(3L,"GBP","INR", 106.0));

	}
}
