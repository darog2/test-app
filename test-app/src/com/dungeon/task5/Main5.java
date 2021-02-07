package com.dungeon.task5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        DriverCategoryCatalog catalog = new DriverCategoryCatalog();
        catalog.printAvailableCategories(age);

    }
}
