package com.dungeon.tax;

public class ObjectExample {
    private static int idCounter = 0;
    private int id;
    private String name;
    public Object2 object2;
    public Object2 object21;
    public Object2 object22;
    public Object2 object23;
    public Object2 object24;

    public ObjectExample() {
        id = ++idCounter;
        name = getClass().getSimpleName()+"___"+id;
    }

    @Override
    public String toString() {
        return name;
    }
}
