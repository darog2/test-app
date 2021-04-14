package com.dungeon.food;

import com.dungeon.food.meals.*;
import com.dungeon.food.products.meat.*;
import com.dungeon.food.products.other.*;
import com.dungeon.food.products.vegetables.*;

public class Chef {
    public Shit cook(Broccoli broccoli) throws NotEnoughProductsException {
        return new Shit(broccoli);
    }
    public Sushi cook(Rice rice, Fish fish, Cheese cheese, Cucumber cucumber)throws NotEnoughProductsException {
        return new Sushi(rice,fish,cheese,cucumber);
    }
    public HotDog cook(Dog dog, Butter butter, Flour flour, Mayonnaise mayonnaise) throws NotEnoughProductsException {
        return new HotDog(dog,butter,flour,mayonnaise);
    }
    public FishInTomato cook(Fish fish, Tomato tomato,Flour flour) throws NotEnoughProductsException {
        return new FishInTomato(fish,tomato,flour);
    }
    public BreakfastOfEggs cook(Egg egg, Zucchini zucchini,Cheese cheese) throws NotEnoughProductsException {
        return new BreakfastOfEggs(egg,zucchini,cheese);
    }
    public VenisonInHungarian cook(Venison venison, Corn corn, Pumpkin pumpkin, Cracker cracker,Potato potato,Duck duck,Pepper pepper,Pork pork,Cabbage cabbage) throws NotEnoughProductsException {
        return new VenisonInHungarian(venison,corn,pumpkin,cracker,potato,duck,pepper,pork,cabbage);
    }
}
