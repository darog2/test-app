package com.dungeon.animals;

import com.dungeon.animals.movement.Swimming;

public class Fish extends Animal{
    public Fish() {
        super(new Swimming());
    }
}
