package com.dungeon.task17;

public class Pizza {
    private String name;
//    private static final double

    public Pizza(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
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
}
