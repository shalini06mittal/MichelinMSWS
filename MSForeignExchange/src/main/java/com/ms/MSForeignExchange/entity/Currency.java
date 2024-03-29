package com.ms.MSForeignExchange.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Currency {

    @Id
    private  long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private double conversionrate;

    private  String port;

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

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
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
