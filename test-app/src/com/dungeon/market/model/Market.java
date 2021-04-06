package com.dungeon.market.model;

public class Market {
    private String name;
    private  int cashRegistersCount;

    public Market() {
    }

    public Market(String name, int cashRegistersCount) {
        this.name = name;
        this.cashRegistersCount = cashRegistersCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCashRegistersCount() {
        return cashRegistersCount;
    }

    public void setCashRegistersCount(int cashRegistersCount) {
        this.cashRegistersCount = cashRegistersCount;
    }
}
