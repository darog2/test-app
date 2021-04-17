package com.dungeon.task17.model;

public enum ComponentAmount {
    NONE(0),
    LESS(0.5),
    MEDIUM(1),
    MORE(1.5),
    A_LOT(2);

    private final double priceMultiplier;

    public double getPriceMultiplier() {
        return priceMultiplier;
    }

    ComponentAmount(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

}
