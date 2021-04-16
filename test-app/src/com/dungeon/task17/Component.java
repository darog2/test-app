package com.dungeon.task17;

public class Component {
    private String name;
    private double price;

    public Component(String name) {

    }

    public Component() {

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

    public Component(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
