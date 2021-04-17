package com.dungeon.task17.model;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private String name;
    public static final double MIN_PRICE = 5;
    private Map<Component, ComponentAmount> composition;

    public Map<Component, ComponentAmount> getComposition() {
        return composition;
    }

    public Pizza(String name) {
        this.name = name;
        this.composition=new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
