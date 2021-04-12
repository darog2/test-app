package com.dungeon.food.meals;

import com.dungeon.food.NotEnoughProductsException;
import com.dungeon.food.products.meat.Duck;
import com.dungeon.food.products.meat.Pork;
import com.dungeon.food.products.meat.Venison;
import com.dungeon.food.products.other.Cracker;
import com.dungeon.food.products.vegetables.Cabbage;
import com.dungeon.food.products.vegetables.Corn;
import com.dungeon.food.products.vegetables.Pepper;
import com.dungeon.food.products.vegetables.Potato;
import com.dungeon.food.products.vegetables.Pumpkin;

public class VenisonInHungarian {
    private Venison venison;
    private Corn corn;
    private Pumpkin pumpkin;
    private Cracker cracker;
    private Potato potato;
    private Duck duck;
    private Pepper pepper;
    private Pork pork;
    private Cabbage cabbage;
    private int venisonRequired=2;
    private int cornRequired=6;
    private int pumpkinRequired=7;
    private int crackerRequired=2;
    private int potatoRequired=7;
    private int duckRequired=2;
    private int pepperRequired=9;
    private int porkRequired=2;
    private int cabbageRequired=4;

    public VenisonInHungarian(Venison venison, Corn corn, Pumpkin pumpkin, Cracker cracker, Potato potato, Duck duck, Pepper pepper, Pork pork, Cabbage cabbage) throws NotEnoughProductsException {
        this.venison = venison;
        this.corn = corn;
        this.pumpkin = pumpkin;
        this.cracker = cracker;
        this.potato = potato;
        this.duck = duck;
        this.pepper = pepper;
        this.pork = pork;
        this.cabbage = cabbage;
        this.venison.takeSome(venisonRequired);
        this.corn.takeSome(cornRequired);
        this.pumpkin.takeSome(pumpkinRequired);
        this.cracker.takeSome(crackerRequired);
        this.potato.takeSome(potatoRequired);
        this.duck.takeSome(duckRequired);
        this.pork.takeSome(porkRequired);
        this.cabbage.takeSome(cabbageRequired);
    }
}
