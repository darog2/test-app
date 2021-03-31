package com.dungeon.animals.fauna;

import com.dungeon.animals.movement.LandMovementMethod;
import com.dungeon.animals.movement.Move;

public class Cat extends Animal{

    public Cat() {
        super(new LandMovementMethod());
    }

    public Cat(Move moveMethod) {
        super(moveMethod);
    }
}
