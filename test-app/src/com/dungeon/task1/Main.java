package com.dungeon.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SeasonHelper helper = new SeasonHelper();

        Scanner scanner = new Scanner(System.in);
        int monthNumber= scanner.nextInt();
        String monthName = helper.getMonthNameByMonthNumber(monthNumber);
        System.out.println(monthName);

        String season = helper.selectSeason(monthName);
        System.out.println(season);
    }
}

//        System.out.println("Welcome to wold");
//        System.out.println("pres 1 to add");
//        System.out.println("pres 2 to sub");
//        System.out.println("pres 3 to mul");
//        System.out.println("pres 4 to div");
//
//        double result;
//        double number1;
//        int number2;
//        Scanner scanner = new Scanner(System.in);
//        number1 = scanner.nextInt();
//        number2 = scanner.nextInt();
//
//        result = number1 + number2;
//        System.out.println("resuld =" + result);
//
//        result = number1 - number2;
//        System.out.println("resuld =" + result);
//
//        result = number1 * number2;
//        System.out.println("resuld =" + result);
//
//        result = number1 / number2;
//        System.out.print("resuld =" + result);