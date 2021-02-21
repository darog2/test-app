package com.dungeon.boolean_trainer.arrays;

import com.dungeon.boolean_trainer.Constants;
import com.dungeon.boolean_trainer.Utils;

//Реализация через массивы
public class Trainer {
    private static final boolean[][] abArray // заполнение таблицы входных данных
            = new boolean[][]{
            {false, false},
            {false, true},
            {true, false},
            {true, true}
    };
    private static final boolean[][] abcArray // заполнение таблицы входных данных
            = new boolean[][]{
            {false, false, false},
            {false, false, true},
            {false, true, false},
            {false, true, true},
            {true, false, false},
            {true, false, true},
            {true, true, false},
            {true, true, true},
    };

    public static void main(String[] args) {
        trainABIfs();   // тренировка условий с 2 переменными // закомменти вызов когда копаешь 3 переменные
        trainABCIfs();  // тренировка условий с 3 переменными // закомменти вызов когда копаешь 2 переменные

    }

    private static void trainABIfs() {
        Utils.printCondition("a && b"); // тут принтишь условие
        for (int i = 0; i < abArray.length; i++) {
            System.out.printf(Constants.A_B_PRINT_TEMPLATE, abArray[i][0], abArray[i][1]);
            if (abArray[i][0]
                    && abArray[i][1]) { // тут вписываешь рабочее условие для 2 переменных
                // abArray[i][0] -- всегда а,
                // abArray[i][1] -- всегда b
                System.out.println(Constants.IF_PROCESSED);
            } else {
                System.out.println(Constants.IF_NOT_PROCESSED);
            }
        }
    }

    private static void trainABCIfs() {
        Utils.printCondition("a && b && c");// тут принтишь условие
        for (int i = 0; i < abcArray.length; i++) {
            System.out.printf(Constants.A_B_C_PRINT_TEMPLATE,abcArray[i][0],abcArray[i][1],abcArray[i][2]);
            if (abcArray[i][0]
                    && abcArray[i][1]
                    && abcArray[i][2]) {// тут вписываешь рабочее условие для 3 переменных
                // abArray[i][0] -- всегда а,
                // abArray[i][1] -- всегда b,
                // abArray[i][2] -- всегда с
                System.out.println(Constants.IF_PROCESSED);
            } else {
                System.out.println(Constants.IF_NOT_PROCESSED);
            }
        }
    }
}
