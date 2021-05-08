package com.dungeon.task7;

import com.dungeon.common.CommonInputUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main7 {


    public static void main(String[] args) {
        int[] number = CommonInputUtils.getInstance().createRandomIntArray();
        System.out.println(Arrays.toString(number));

    }

    public static void descendingSort(int[] numbers) {

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 10;
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            int max = numbers[i];
            int maxI = i;


            for (int j = i; j < numbers.length; j++) {
                int current = numbers[j];
                if (max < current) {
                    max = current;
                    maxI = j;
                }

            }
            System.out.println("max = " + max);
            int temp = numbers[i];
            numbers[i] = numbers[maxI];
            numbers[maxI] = temp;
            System.out.println(Arrays.toString(numbers));
        }
    }

    public static void intMinAndMax() {
        int[] numbers = new int[5];
        numbers[0] = 500;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 1000;
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[4] = " + numbers[4]);
        //////////////////////
        int temp = numbers[3];
        numbers[3] = numbers[1];
        numbers[1] = temp;

        System.out.println("\n\n\n\n");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[4] = " + numbers[4]);

        //////////////////////
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (min > current) {
                min = current;
            }
            if (max < current) {
                max = current;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


//        if (min > numbers[1]) {
//            min = numbers[1];
//        }
//        if (min > numbers[2]) {
//            min = numbers[2];
//        }
//        if (min > numbers[3]) {
//            min = numbers[3];
//        }
//        if (min > numbers[4]) {
//            min = numbers[4];
//        }
//        System.out.println(min);
//        if (max < numbers[1]) {
//            max = numbers[1];
//        }
//        if (max < numbers[2]) {
//            max = numbers[2];
//        }
//        if (max < numbers[3]) {
//            max = numbers[3];
//        }
//        if (max < numbers[4]) {
//            max = numbers[4];
//        }
//        System.out.println(max);


    }

    public static void bubbleSort(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                int current = numbers[j];
                int next = numbers[j + 1];
                if (current > next) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void countSearchStringInArray() {
        String[] strings = new String[10];
        strings[0] = "aaa";
        strings[1] = "aaa";
        strings[2] = "aaa";
        strings[3] = "bbb";
        strings[4] = "bbb";
        strings[5] = "ccc";
        strings[6] = "ccc";
        strings[7] = "ccc";
        strings[8] = "ccc";
        strings[9] = "ddd";
        System.out.println(Arrays.toString(strings));
        String search = "aaa";
        int count = 0;
        if (search == strings[0]) {
            count++;
        }
        if (search == strings[1]) {
            count++;
        }
        if (search == strings[2]) {
            count++;
        }
        if (search == strings[3]) {
            count++;
        }
        if (search == strings[4]) {
            count++;
        }
        if (search == strings[5]) {
            count++;
        }
        if (search == strings[6]) {
            count++;
        }
        if (search == strings[7]) {
            count++;
        }
        if (search == strings[8]) {
            count++;
        }
        if (search == strings[9]) {
            count++;
        }
        System.out.println(count);
    }

    public void replaceSearchSymbolInString() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String searchString = scanner.nextLine();
        char search = searchString.charAt(0);
        char[] symbols = userInput.toCharArray();

        for (int i = 0; i < userInput.length(); i++) {
            if (symbols[i] == search) {
                symbols[i] = 'a';
            }
        }
        userInput = String.valueOf(symbols);
        System.out.println(userInput);


    }

    public void countIntMatches() {
        System.out.println("введите размер массива ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("введите желаемое число ");
        int search = scanner.nextInt();
        int[] number = new int[size];

        Random random = new Random();
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(45) + 5;
        }
//        number[0] = 2;
//        number[1] = 4;
//        number[2] = 5;
//        number[3] = 9;
//        number[4] = 14;
//        number[5] = 18;
//        number[6] = 33;
        System.out.println(Arrays.toString(number));

        int count = 0;


        for (int i = 0; i < number.length; i++) {
            if (search == number[i]) {
                count++;
            }

        }
        System.out.println(count);
    }
}
