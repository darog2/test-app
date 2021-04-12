package com.dungeon.food;

import com.dungeon.food.meals.Sushi;
import com.dungeon.food.products.meat.Fish;
import com.dungeon.food.products.meat.Shit;
import com.dungeon.food.products.other.Cheese;
import com.dungeon.food.products.vegetables.Broccoli;
import com.dungeon.food.products.vegetables.Cucumber;
import com.dungeon.food.products.vegetables.Rice;

public class FoodMain {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Broccoli broccoli = new Broccoli(800);
        Rice rice = new Rice(10);
        Cheese cheese = new Cheese(20);
        Cucumber cucumber= new Cucumber(22);
        Fish fish= new Fish(32);
        try {
            Shit shit = chef.cook(broccoli);
            Sushi sushi= chef.cook(rice,fish,cheese,cucumber);
        } catch (NotEnoughProductsException e) {
            e.printStackTrace();
        } finally {

        }
        System.out.println("bhiugfyubfnfgm");
    }

}
