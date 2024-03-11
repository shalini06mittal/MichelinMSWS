package com.web.ForeignExchange.entity;

import jakarta.persistence.*;

@Entity
public class Currency {

    @Id
    private  long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private double conversionrate;

    public Currency() {
    }

    public Currency(long id, String from, String to, double conversionrate) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionrate = conversionrate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public double getConversionrate() {
        return conversionrate;
    }

    public void setConversionrate(double conversionrate) {
        this.conversionrate = conversionrate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionrate=" + conversionrate +
                '}';
    }
}
