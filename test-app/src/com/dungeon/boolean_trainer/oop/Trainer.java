package com.dungeon.boolean_trainer.oop;

import com.dungeon.boolean_trainer.Constants;
import com.dungeon.boolean_trainer.Utils;

import java.util.LinkedList;
import java.util.List;

//Реализация через коллекции и прочее ООП :D
public class Trainer {

    private static final List<ABEntry<Boolean>> booleanABEntries = new LinkedList<>();

    private static final List<ABCEntry<Boolean>> booleanABCEntries = new LinkedList<>();

    public static void main(String[] args) {
        fillAB();       // заполнение таблицы входных данных
        fillABC();      // заполнение таблицы входных данных
        trainABIfs();   // тренировка условий с 2 переменными // закомменти вызов когда копаешь 3 переменные
        trainABCIfs();  // тренировка условий с 3 переменными // закомменти вызов когда копаешь 2 переменные

    }

    private static void trainABIfs() {
        Utils.printCondition("a && b");
        for (ABEntry<Boolean> abEntry : booleanABEntries) {
            System.out.print(abEntry.toString());// тут принтишь условие
            if (abEntry.getA() && abEntry.getB()) {// тут вписываешь рабочее условие для 2 переменных
                // abEntry.getA() -- всегда а,
                // abEntry.getВ() -- всегда b,
                System.out.println(Constants.IF_PROCESSED);
            } else {
                System.out.println(Constants.IF_NOT_PROCESSED);
            }
        }
    }

    private static void trainABCIfs() {
        Utils.printCondition("a && b && c");// тут принтишь условие
        for (ABCEntry<Boolean> abcEntry : booleanABCEntries) {
            System.out.print(abcEntry.toString());
            if (abcEntry.getA() && abcEntry.getB() && abcEntry.getC()) {// тут вписываешь рабочее условие для 3 переменных
                // abcEntry.getA() -- всегда а,
                // abcEntry.getВ() -- всегда b,
                // abcEntry.getС() -- всегда с
                System.out.println(Constants.IF_PROCESSED);
            } else {
                System.out.println(Constants.IF_NOT_PROCESSED);
            }
        }
    }

    private static void fillAB() {
        booleanABEntries.add(new ABEntry<>(false, false));
        booleanABEntries.add(new ABEntry<>(false, true));
        booleanABEntries.add(new ABEntry<>(true, false));
        booleanABEntries.add(new ABEntry<>(true, true));
    }

    private static void fillABC() {
        booleanABCEntries.add(new ABCEntry<>(false, false, false));
        booleanABCEntries.add(new ABCEntry<>(false, false, true));
        booleanABCEntries.add(new ABCEntry<>(false, true, false));
        booleanABCEntries.add(new ABCEntry<>(false, true, true));
        booleanABCEntries.add(new ABCEntry<>(true, false, false));
        booleanABCEntries.add(new ABCEntry<>(true, false, true));
        booleanABCEntries.add(new ABCEntry<>(true, true, false));
        booleanABCEntries.add(new ABCEntry<>(true, true, true));

    }
}
