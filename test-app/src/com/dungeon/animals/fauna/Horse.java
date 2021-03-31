package com.dungeon.animals.fauna;

import com.dungeon.animals.movement.LandMovementMethod;
import com.dungeon.animals.movement.Move;

public class Horse extends Animal {
    public Horse() {
        super(new LandMovementMethod());
    }

    public Horse(Move moveMethod) {
        super(moveMethod);
    }
}
