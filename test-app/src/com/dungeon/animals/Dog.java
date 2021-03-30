package com.dungeon.animals;

import com.dungeon.animals.movement.LandMovementMethod;

public class Dog extends Animal {

    public Dog() {
        super(new LandMovementMethod());
    }

}
