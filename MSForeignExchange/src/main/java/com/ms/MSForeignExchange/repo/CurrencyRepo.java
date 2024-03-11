package com.ms.MSForeignExchange.repo;


import com.ms.MSForeignExchange.entity.Currency;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepo  extends CrudRepository<Currency, Long> {

    public Currency findByFromAndTo(String from, String to);
}
