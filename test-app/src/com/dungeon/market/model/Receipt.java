package com.dungeon.market.model;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Receipt {
    private Cashier cashier;
    private Map<Product, Integer> products;
    private Date date;

    public Receipt(Cashier cashier, Map<Product, Integer> products, Date date) {
        this.cashier = cashier;
        this.products = products;
        this.date = date;
    }

    public Receipt() {
        this.products = new LinkedHashMap<>();
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
