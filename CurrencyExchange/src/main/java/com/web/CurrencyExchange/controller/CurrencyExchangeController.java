package com.web.CurrencyExchange.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.web.CurrencyExchange.model.ConversionBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class CurrencyExchangeController {

	@RequestMapping("/exchange/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean calculateAmount(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity)
	{

		String url = "http://localhost:8081/forex/from/{from}/to/{to}";
		RestTemplate template = new RestTemplate();
		Map<String, String> map = new HashMap<>();
		map.put("from", from);
		map.put("to", to);

		ConversionBean bean = template.getForObject(url, ConversionBean.class, map);
		bean.setQuantity(quantity);
		bean.setTotalCalculatedAmount(bean.getQuantity().multiply(bean.getConversionrate()));
		return bean;
	}
	
}
