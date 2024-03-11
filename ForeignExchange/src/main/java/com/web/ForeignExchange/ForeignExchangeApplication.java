package com.web.ForeignExchange;

import com.web.ForeignExchange.entity.Currency;
import com.web.ForeignExchange.repo.CurrencyRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForeignExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForeignExchangeApplication.class, args);
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
