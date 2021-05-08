package com.dungeon.animals.fauna;

import com.dungeon.animals.movement.LandMovementMethod;
import com.dungeon.animals.movement.Move;
import com.dungeon.animals.movement.Swimming;

public class Dog extends Animal implements GoingAndSwimmingAnimal {
    private Move swimming;

    public Dog() {
        this(new LandMovementMethod(), new Swimming());
    }

    public Dog(Move moveMethod, Move swimming) {
        super(moveMethod);
        this.swimming = swimming;

    }

    @Override
    public void go() {
        moveMethod.move(getClass().getSimpleName());
    }

    @Override
    public void swim() {
        swimming.move(getClass().getSimpleName());
    }
}
