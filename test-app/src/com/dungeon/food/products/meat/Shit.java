package com.dungeon.food.products.meat;

import com.dungeon.food.NotEnoughProductsException;
import com.dungeon.food.products.vegetables.Broccoli;

public class Shit {
    private Broccoli broccoli;
    private int broccoliRequired = 100;

    public Shit(Broccoli broccoli) throws NotEnoughProductsException {
        this.broccoli = broccoli;
        this.broccoli.takeSome(broccoliRequired);
    }
}
