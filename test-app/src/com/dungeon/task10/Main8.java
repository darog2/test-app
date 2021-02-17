package com.dungeon.task10;

import com.dungeon.task10.model.Car;

public class Main8 {
    public static void main(String[] args) throws CloneNotSupportedException {
        DataGenerator dataGenerator= new DataGenerator();
        Car[] cars= dataGenerator.createArray();
        FilterManager filterManager= new FilterManager();
        filterManager.filterByColor(cars,"red");
        filterManager.filterByColor(cars,"yellow");
        filterManager.filterByColor(cars,"black");
    }
}
