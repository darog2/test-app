package com.dungeon.animals.fauna;

public interface GoingAnimal {
    void go();

    default void say() {
        System.out.println("GoingAnimal");
    }
}
