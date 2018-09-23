package com.blackjets.shop.model;

import java.math.BigDecimal;

public class Phone {
    private int id;
    private String companyName;
    private String model;
    private BigDecimal cost;

    public Phone() {
    }

    public Phone(int id, String companyName, String model, BigDecimal cost) {
        this.id = id;
        this.companyName = companyName;
        this.model = model;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
