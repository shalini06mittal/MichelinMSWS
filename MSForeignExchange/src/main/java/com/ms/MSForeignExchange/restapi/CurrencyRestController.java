package com.ms.MSForeignExchange.restapi;


import com.ms.MSForeignExchange.entity.Currency;
import com.ms.MSForeignExchange.repo.CurrencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyRestController {

    @Autowired
    private CurrencyRepo repo;

    @GetMapping("/forex/from/{from}/to/{to}")
    public Currency getConversionRate(@PathVariable String from, @PathVariable String to)
    {
        return repo.findByFromAndTo(from, to);
    }
}
