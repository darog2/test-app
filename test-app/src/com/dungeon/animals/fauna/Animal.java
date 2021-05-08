package com.dungeon.animals.fauna;

import com.dungeon.animals.movement.Move;

public abstract class Animal {
    protected final Move moveMethod;
    protected String name;
    protected String family;

    protected Animal(Move moveMethod) {
        this.moveMethod = moveMethod;
    }


    public void move() {
        moveMethod.move(this.getClass().getSimpleName());
    }
}
