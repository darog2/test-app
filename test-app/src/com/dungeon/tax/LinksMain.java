package com.dungeon.tax;

public class LinksMain {
    public static void main(String[] args) {
        ObjectExample example = new ObjectExample();
        Object2 object2 = new Object2();
        Object2 object222 = new Object2();
        example.object2 = object2;
        example.object21 = object2;
        example.object22 = object222;
        example.object23 = object222;
        example.object24 = new Object2();
        System.out.println();
    }
}
