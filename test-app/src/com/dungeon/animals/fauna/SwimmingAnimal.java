package com.dungeon.animals.fauna;

public interface SwimmingAnimal {
    void swim();

    default void say() {
        System.out.println("SwimmingAnimal");
    }
}
