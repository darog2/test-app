package com.dungeon.food;

import com.dungeon.food.meals.BreakfastOfEggs;
import com.dungeon.food.meals.FishInTomato;
import com.dungeon.food.meals.HotDog;
import com.dungeon.food.meals.Sushi;
import com.dungeon.food.meals.VenisonInHungarian;
import com.dungeon.food.products.meat.Dog;
import com.dungeon.food.products.meat.Duck;
import com.dungeon.food.products.meat.Egg;
import com.dungeon.food.products.meat.Fish;
import com.dungeon.food.products.meat.Pork;
import com.dungeon.food.products.meat.Shit;
import com.dungeon.food.products.meat.Venison;
import com.dungeon.food.products.other.Butter;
import com.dungeon.food.products.other.Cheese;
import com.dungeon.food.products.other.Cracker;
import com.dungeon.food.products.other.Flour;
import com.dungeon.food.products.other.Mayonnaise;
import com.dungeon.food.products.vegetables.Broccoli;
import com.dungeon.food.products.vegetables.Cabbage;
import com.dungeon.food.products.vegetables.Corn;
import com.dungeon.food.products.vegetables.Cucumber;
import com.dungeon.food.products.vegetables.Pepper;
import com.dungeon.food.products.vegetables.Potato;
import com.dungeon.food.products.vegetables.Pumpkin;
import com.dungeon.food.products.vegetables.Rice;
import com.dungeon.food.products.vegetables.Tomato;
import com.dungeon.food.products.vegetables.Zucchini;

public class Chef {
    public Shit cook(Broccoli broccoli) throws NotEnoughProductsException {
        return new Shit(broccoli);
    }

    public Sushi cook(Rice rice, Fish fish, Cheese cheese, Cucumber cucumber) throws NotEnoughProductsException {
        return new Sushi(rice, fish, cheese, cucumber);
    }

    public HotDog cook(Dog dog, Butter butter, Flour flour, Mayonnaise mayonnaise) throws NotEnoughProductsException {
        return new HotDog(dog, butter, flour, mayonnaise);
    }

    public FishInTomato cook(Fish fish, Tomato tomato, Flour flour) throws NotEnoughProductsException {
        return new FishInTomato(fish, tomato, flour);
    }

    public BreakfastOfEggs cook(Egg egg, Zucchini zucchini, Cheese cheese) throws NotEnoughProductsException {
        return new BreakfastOfEggs(egg, zucchini, cheese);
    }

    public VenisonInHungarian cook(Venison venison, Corn corn, Pumpkin pumpkin, Cracker cracker, Potato potato, Duck duck, Pepper pepper, Pork pork, Cabbage cabbage) throws NotEnoughProductsException {
        return new VenisonInHungarian(venison, corn, pumpkin, cracker, potato, duck, pepper, pork, cabbage);
    }
}
