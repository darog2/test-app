package com.dungeon.food.meals;

import com.dungeon.food.NotEnoughProductsException;
import com.dungeon.food.products.meat.Fish;
import com.dungeon.food.products.other.Cheese;
import com.dungeon.food.products.vegetables.Cucumber;
import com.dungeon.food.products.vegetables.Rice;

public class Sushi {
    private Rice rice;
    private Fish fish;
    private Cheese cheese;
    private Cucumber cucumber;
    private int riceRequired = 5;
    private int fishRequired = 2;
    private int cheesRequired = 3;
    private int cucumberRequired = 4;

    public Sushi(Rice rice, Fish fish, Cheese cheese, Cucumber cucumber) throws NotEnoughProductsException {
        this.rice = rice;
        this.fish = fish;
        this.cheese = cheese;
        this.cucumber = cucumber;
        this.rice.takeSome(riceRequired);
        this.cheese.takeSome(cheesRequired);
        this.cucumber.takeSome(cucumberRequired);
        this.fish.takeSome(fishRequired);
    }
}
