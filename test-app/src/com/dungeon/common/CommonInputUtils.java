package com.dungeon.common;

import java.util.Random;
import java.util.Scanner;

public class CommonInputUtils {
    private static CommonInputUtils instance = null;

    public static CommonInputUtils getInstance() {
        if (null == instance) {
            instance = new CommonInputUtils();
        }
        return instance;
    }

    private final Scanner scanner;
    private final Random random;


    private CommonInputUtils() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public String readLine(String comment) {
        System.out.print(comment + ": ");
        return scanner.nextLine();

    }

    public int readInt(String comment) {
        System.out.print(comment + ": ");
        int anInt = scanner.nextInt();
        scanner.nextLine();
        return anInt;
    }

    public double readDouble(String comment) {
        System.out.print(comment + ": ");
        String aDouble = scanner.nextLine();
        return Double.parseDouble(aDouble);
    }

    public int[] readIntArray() {
        int size = readInt("введите размер массива");
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = readInt("введите " + i + " элемент массива");
        }
        return result;
    }

    public double[] readDoubleArray() {
        int size = readInt("введите размер массива");
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = readDouble("введите " + i + " элемент массива");
        }
        return result;
    }

    public String[] readStringArray() {
        int size = readInt("введите размер массива");
        String[] result = new String[size];
        for (int i = 0; i < size; i++) {
            result[i] = readLine("введите " + i + " элемент массива");
        }
        return result;
    }

    public int[] createRandomIntArray(int size, int min, int max) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(max - min+1) + min;
        }
        return result;

    }

    public int[] createRandomIntArray() {
        int size = readInt("введите размер массива");
        int min = readInt("введите минимальное значение рандома");
        int max = readInt("введите максимальное значение рандома");
        return createRandomIntArray(size, min, max);
    }

}
