package com.dungeon.test;

import com.dungeon.common.CommonInputUtils;


import java.util.Arrays;


public class Main {
    public static void main( String[] args) {

        int[] mas = CommonInputUtils.getInstance().createRandomIntArray(10, 2, 22);
//        int[] mas = {17, 14, 8, 6, 2, 4, 12, 4, 8, 5};
        System.out.println(Arrays.toString(mas));
        boolean isSorted;
        int cnt=0;
        do {
            cnt++;
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[0 + i] > mas[0 + 1 + i]) {
                    isSorted = false;
                    swap(mas, i, i + 1);
                }
                if (mas[mas.length - 1-i] < mas[mas.length - 2-i]) {
                    isSorted = false;
                    swap(mas, mas.length - 1-i, mas.length - 2-i);
                }
            }
        } while (!isSorted);
        System.out.println(Arrays.toString(mas));
        System.out.println(cnt);
    }

    public static void swap(int[] mas, int i1, int i2) {
        int buf;

        buf = mas[i1];
        mas[i1] = mas[i2];
        mas[i2] = buf;
    }
}
