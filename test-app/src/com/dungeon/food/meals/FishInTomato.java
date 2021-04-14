package com.dungeon.food.meals;

import com.dungeon.food.NotEnoughProductsException;
import com.dungeon.food.products.meat.Fish;
import com.dungeon.food.products.other.Flour;
import com.dungeon.food.products.vegetables.Tomato;

public class FishInTomato {
    private Fish fish;
    private Tomato tomato;
    private Flour flour;
    private int fishRequired=5;
    private  int tomatoRequired=6;
    private int flourRequired=2;

    public FishInTomato(Fish fish, Tomato tomato, Flour flour) throws NotEnoughProductsException {
        this.fish = fish;
        this.tomato = tomato;
        this.flour = flour;
        this.fish.takeSome(fishRequired);
        this.flour.takeSome(flourRequired);
        this.tomato.takeSome(tomatoRequired);
    }
}
