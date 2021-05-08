package com.dungeon.food.meals;


import com.dungeon.food.NotEnoughProductsException;
import com.dungeon.food.products.meat.Dog;
import com.dungeon.food.products.other.Butter;
import com.dungeon.food.products.other.Flour;
import com.dungeon.food.products.other.Mayonnaise;

public class HotDog {
    private Dog dog;
    private Butter butter;
    private Flour flour;
    private Mayonnaise mayonnaise;
    private int dogRequired = 1;
    private int butterRequired = 3;
    private int flourRequired = 7;
    private int mayonnaiseRequired = 1;

    public HotDog(Dog dog, Butter butter, Flour flour, Mayonnaise mayonnaise) throws NotEnoughProductsException {
        this.dog = dog;
        this.butter = butter;
        this.flour = flour;
        this.mayonnaise = mayonnaise;
        this.butter.takeSome(butterRequired);
        this.dog.takeSome(dogRequired);
        this.flour.takeSome(flourRequired);
        this.mayonnaise.takeSome(mayonnaiseRequired);
    }
}
