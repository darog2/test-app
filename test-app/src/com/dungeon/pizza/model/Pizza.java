package com.dungeon.pizza.model;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    public static final double MIN_PRICE = 5;
    private String name;
    private Map<Component, ComponentAmount> composition;

    public Pizza(String name) {
        this.name = name;
        this.composition = new HashMap<>();
    }

    public Map<Component, ComponentAmount> getComposition() {
        return composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
