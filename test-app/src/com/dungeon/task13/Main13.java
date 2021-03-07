package com.dungeon.task13;

import com.dungeon.common.CommonInputUtils;

import java.util.Arrays;

public class Main13 {
    private static final String NUMBER_TYPES_COUNTERS_OUTPUT_TEMPLATE
            = "Zeroes\t= %d\nEven\t= %d\nOdd\t\t= %d\n";
    private static final String NUMBER_TYPES_COUNTERS_TOTAL_OUTPUT_TEMPLATE
            = "-----------------------------------------\nZeroes total\t= %d\nEven total\t= %d\nOdd total\t\t= %d\n";
    private static final String ROW_DESCRIPTION_OUTPUT_TEMPLATE
            = "Row number:\t%d\nRow:\t\t%s\n";

    public static void main(String[] args) {
        processMatrix();
    }

    public static void processArray() {

        int[] numbers = CommonInputUtils.getInstance().createRandomIntArray(10, -1, 20);
        System.out.println(Arrays.toString(numbers));
        int counterZeroes = 0;
        int counterEven = 0;
        int counterOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {

                counterZeroes++;
            } else if (numbers[i] % 2 == 0) {
                counterEven++;
            } else {
                numbers[i] = 1;
                counterOdd++;
            }
        }
        System.out.printf(NUMBER_TYPES_COUNTERS_OUTPUT_TEMPLATE,
                counterZeroes,
                counterEven,
                counterOdd);
    }

    public static void processMatrix() {
        int counterZeroesTotal = 0;
        int counterEvenTotal = 0;
        int counterOddTotal = 0;
        int matrixSize = 4;
        int[][] numbers2 = new int[matrixSize][matrixSize];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = CommonInputUtils.getInstance().createRandomIntArray(matrixSize, -1, 9);
            System.out.println(Arrays.toString(numbers2[i]));
        }
        for (int row = 0; row < numbers2.length; row++) {
            int counterZeroes = 0;
            int counterEven = 0;
            int counterOdd = 0;
            for (int column = 0; column < numbers2[row].length; column++) {
                switch (defineType(numbers2[row][column])){
                    case ZERO:
                        counterZeroes++;
                        break;
                    case EVEN:
                        counterEven++;
                        break;
                    case ODD:
                        counterOdd++;
                        break;

                }
            }
            System.out.printf(ROW_DESCRIPTION_OUTPUT_TEMPLATE,row,Arrays.toString(numbers2[row]));
            System.out.printf(NUMBER_TYPES_COUNTERS_OUTPUT_TEMPLATE,counterZeroes,counterEven,counterOdd);
            counterZeroesTotal += counterZeroes;
            counterEvenTotal += counterEven;
            counterOddTotal += counterOdd;
        }

        System.out.printf(NUMBER_TYPES_COUNTERS_TOTAL_OUTPUT_TEMPLATE,counterZeroesTotal,counterEvenTotal,counterOddTotal);
    }

    private static NumberType defineType(int number) {
        if (number == 0) {
            return NumberType.ZERO;
        } else if (number % 2 == 0) {
            return NumberType.EVEN;
        } else {
            return NumberType.ODD;
        }
    }
}
