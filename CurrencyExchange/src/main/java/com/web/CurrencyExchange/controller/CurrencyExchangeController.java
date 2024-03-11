package com.web.CurrencyExchange.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.web.CurrencyExchange.model.ConversionBean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
public class CurrencyExchangeController {

	/**
	 * 1. Createion of RestTemplate object => spring
	 * 2. http://<dynamic>/forex/from/{from}/to/{to} => static url
	 * 3. dynamic part : application id
	 * 4. dynamic url: servcies ned to be discoverable
	 * make it availabels to other services
	 * provide load balancers
	 * monitor  the health of the services
	 *
	 * Discovery Server: Eureka server
	 * 5. Register your service to be availabel ti discoverable by the application id
	 * @param from
	 * @param to
	 * @param quantity
	 * @return
	 */
	@RequestMapping("/exchange/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean calculateAmount(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
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
