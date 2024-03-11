package com.web.ForeignExchange.repo;

import com.web.ForeignExchange.entity.Currency;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepo  extends CrudRepository<Currency, Long> {

    public Currency findByFromAndTo(String from, String to);
}
