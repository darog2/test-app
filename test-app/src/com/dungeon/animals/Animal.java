package com.dungeon.animals;

import com.dungeon.animals.movement.Move;

public abstract class Animal{
    protected String name ;
    protected String family;
    protected final Move moveMethod;

    protected Animal(Move moveMethod) {
        this.moveMethod = moveMethod;
    }


    public void move() {
        moveMethod.move(this.getClass().getSimpleName());
    }
}
