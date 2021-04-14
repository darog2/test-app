package com.dungeon.food;

import com.dungeon.food.meals.Sushi;
import com.dungeon.food.products.meat.Fish;
import com.dungeon.food.products.meat.Shit;
import com.dungeon.food.products.other.Cheese;
import com.dungeon.food.products.vegetables.Broccoli;
import com.dungeon.food.products.vegetables.Cucumber;
import com.dungeon.food.products.vegetables.Rice;

public class Chef {
    public Shit cook(Broccoli broccoli) throws NotEnoughProductsException {
        return new Shit(broccoli);
    }
    public Sushi cook(Rice rice, Fish fish, Cheese cheese, Cucumber cucumber)throws NotEnoughProductsException {
        return new Sushi(rice,fish,cheese,cucumber);
    }
}
