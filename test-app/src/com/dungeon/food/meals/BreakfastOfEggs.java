package com.dungeon.food.meals;

import com.dungeon.food.NotEnoughProductsException;
import com.dungeon.food.products.meat.Egg;
import com.dungeon.food.products.other.Cheese;
import com.dungeon.food.products.vegetables.Zucchini;

public class BreakfastOfEggs {
    private Egg egg;
    private Zucchini zucchini;
    private Cheese cheese;
    private int eggRequired=4;
    private int zucchiniRequired=2;
    private  int cheeseRequired=2;

    public BreakfastOfEggs(Egg egg, Zucchini zucchini, Cheese cheese) throws NotEnoughProductsException {
        this.egg = egg;
        this.zucchini = zucchini;
        this.cheese = cheese;
        this.cheese.takeSome(cheeseRequired);
        this.egg.takeSome(eggRequired);
        this.zucchini.takeSome(zucchiniRequired);
    }
}
