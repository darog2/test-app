package com.dungeon.food;

public class NotEnoughProductsException extends Exception {

    public static final String TEMPLATE = "You're trying to take %d %s's, but you have only %d";

    public NotEnoughProductsException(String name, int count, int take) {
        super(String.format(TEMPLATE, take, name, count));
    }
}
