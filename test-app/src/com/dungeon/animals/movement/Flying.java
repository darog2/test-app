package com.dungeon.animals.movement;

public class Flying implements Move {
    @Override
    public void move(String s) {
        System.out.println(s + " flying");
    }
}
