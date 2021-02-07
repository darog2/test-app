package com.dungeon.task2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        WeekHelper weekHelper = new WeekHelper();

        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();

        String dayName = weekHelper.dayHelper(dayNumber);
        System.out.println(dayName);

        String isweekend = weekHelper.isWeekend(dayName);
        System.out.println(isweekend);


    }

}
