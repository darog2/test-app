package com.dungeon.animals.movement;

public class Swimming implements Move{
    @Override
    public void move(String s) {
        System.out.println(s + " swimming");
    }
}
