package com.ms.MSCurrencyExchange.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.ms.MSCurrencyExchange.model.ConversionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
public class CurrencyExchangeController {

	@Autowired
	private RestTemplate template;

	@RequestMapping("/exchange/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean calculateAmount(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
//		String url = "http://localhost:8081/forex/from/{from}/to/{to}";
		String url = "http://FOREIGN-EXCHANGE/forex/from/{from}/to/{to}";
		//RestTemplate template = new RestTemplate();
		Map<String, String> map = new HashMap<>();
		map.put("from", from);
		map.put("to", to);

		ConversionBean bean = template.getForObject(url, ConversionBean.class, map);
		bean.setQuantity(quantity);
		bean.setTotalCalculatedAmount(bean.getQuantity().multiply(bean.getConversionrate()));
		return bean;
	}

}
