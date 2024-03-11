package com.ms.MSCurrencyExchange.model;

import java.math.BigDecimal;

public class ConversionBean {

	private Long id;
    private String from;
    private String to;
    private BigDecimal conversionrate;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;

    public ConversionBean() {

    }

    public ConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
                                  BigDecimal totalCalculatedAmount) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionrate = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionrate() {
        return conversionrate;
    }

    public void setConversionrate(BigDecimal conversionrate) {
        this.conversionrate = conversionrate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }
}
