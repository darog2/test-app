package com.dungeon.boolean_trainer;

public class Utils {
    public static void printCondition(String condition) {
        System.out.println(System.lineSeparator()
                + System.lineSeparator()
                + Constants.STARS_LINE);
        System.out.printf(Constants.CONDITION_PRINT_TEMPLATE, condition);
        System.out.println(Constants.STARS_LINE);
    }
}
