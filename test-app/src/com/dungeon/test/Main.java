package com.dungeon.test;

import com.dungeon.common.CommonInputUtils;

import java.util.Arrays;

public class Main {
    public static void main( String[] args) {

//        int [] mas =CommonInputUtils.getInstance().createRandomIntArray(8,2,22);
//
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length-1; i++) {
//                if(mas[i] > mas[i+1]){
//                    isSorted = false;
//
//                    buf = mas[i];
//                    mas[i] = mas[i+1];
//                    mas[i+1] = buf;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(mas));
//    }
        PupAge pupAge = new PupAge();
        pupAge.pupAge();
    }
}