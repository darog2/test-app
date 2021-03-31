package com.dungeon.animals.fauna;

public interface GoingAndSwimmingAnimal extends GoingAnimal,SwimmingAnimal{


    @Override
    default void say() {
        GoingAnimal.super.say();
        SwimmingAnimal.super.say();
    }
}
