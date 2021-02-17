package com.dungeon.task10;

import com.dungeon.task10.model.Car;

public class FilterManager {
    public void filterByColor(Car[] cars, String color) {
        System.out.print(color + " cars: ");
        boolean found = false;
        for (int i = 0; i < cars.length; i++) {
            if (color.equalsIgnoreCase(cars[i].getColor())) {
                found = true;
                System.out.println(cars[i].getManufacturer()
                        + "  "
                        + cars[i].getModelName());
            }

        }
        if (!found) {
            System.out.println(" not found!");
        }
    }

}
