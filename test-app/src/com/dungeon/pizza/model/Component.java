package com.dungeon.pizza.model;

public class Component {
    private String name;
    private double price;

    public Component(String name) {

    }

    public Component() {

    }

    public Component(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
