package com.dungeon.animals;

import com.dungeon.animals.movement.LandMovementMethod;
import com.dungeon.animals.movement.Move;

public class Cat extends Animal{

    public Cat() {
        super(new LandMovementMethod());
    }
}
