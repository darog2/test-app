package com.dungeon.animals;

import com.dungeon.animals.movement.Swimming;

public class Penguin extends Animal{
    public Penguin() {
        super(new Swimming());
    }

}
