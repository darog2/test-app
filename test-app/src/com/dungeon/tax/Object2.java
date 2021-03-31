package com.dungeon.tax;

public class Object2 {
    private static int idCounter = 0;
    private int id;
    private String name;

    public Object2() {
        id = ++idCounter;
        name = getClass().getSimpleName()+"___"+id;
    }

//    @Override
//    public String toString() {
//        return name;
//    }
}
