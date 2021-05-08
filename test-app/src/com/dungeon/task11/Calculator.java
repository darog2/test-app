package com.dungeon.task11;

import java.util.Scanner;

public class Calculator {
    private static final String DESIRED_SUM_OUTPUT_TEMPLATE = "desired sum = %f\nfinal sum = %f\nsteps count = %d";
    private static final String CURRENT_TERM_OUTPUT_TEMPLATE = "current step = %d\ncurrent term = %f\ncurrent sum = %f";
    private final Scanner scanner = new Scanner(System.in);

    public void desiredSum() {
        double sum = 0;
        int counter = 0;
        System.out.println("input desired sum");
        double desiredSum = readDouble();
        while (sum < desiredSum) {
            double term = readDouble();
            counter++;
            sum += term;
            System.out.println(String.format(CURRENT_TERM_OUTPUT_TEMPLATE, counter, term, sum));
        }
        System.out.println(String.format(DESIRED_SUM_OUTPUT_TEMPLATE, desiredSum, sum, counter));
    }

    private double readDouble() {
        String line;
        String fullLine;
        boolean isCorrect;
        do {
            fullLine = scanner.nextLine();
            line =
                    fullLine.startsWith("-") || fullLine.startsWith("+")
                            ? fullLine.substring(1)
                            : fullLine;
            boolean isPointFound = false;
            isCorrect = true;
            if (line.isEmpty() || line.equals(".")) {
                isCorrect = false;
            } else {
                char[] symbols = line.toCharArray();
                for (int i = 0; i < symbols.length; i++) {
                    if (!Character.isDigit(symbols[i])) {
                        if (symbols[i] == '.') {
                            if (isPointFound) {
                                isCorrect = false;
                                break;
                            } else {
                                isPointFound = true;
                            }
                        } else {

                            isCorrect = false;
                            break;
                        }
                    }
                }
            }
            if (!isCorrect) {
                System.out.println("incorrect input, try again");
            }
        } while (!isCorrect);
        return Double.parseDouble(fullLine);
    }
//    public double calculateByMassAndHeight(double mass, double height) {
//
//
//    }

    //    public void process() {
//        System.out.println("нажмите \n1 расчитать обьем" +
//                " \n 2 расчитать массу" +
//                " \n3 плотность " +
//                "\n выход");
//        double choice;
//        choice = scanner.nextDouble();
//        String mass;
//        String material;
//        String volume;
//        switch () {
//            case 1:
//                mass = scanner.nextLine();
//                material = scanner.nextLine();
//                break;
//            case 2:
//                volume = scanner.nextLine();
//                material = scanner.nextLine();
//                break;
//            case 3:
//                material = scanner.nextLine();
//                volume = scanner.nextLine();
//                break;
//            case 4:
//                break;
//            default:
//                break;
//        }
//
//
//    }

}

