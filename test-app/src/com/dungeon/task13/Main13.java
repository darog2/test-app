package com.dungeon.task13;

import com.dungeon.common.CommonInputUtils;

import java.util.Arrays;

public class Main13 {
    public static void main(String[] args) {
//        int[] numbers= CommonInputUtils.getInstance().createRandomIntArray(15,3,15);
//        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] % 2==0){
//                numbers[i]=0;
//            }else  {
//                numbers[i]=1;
//            }
//            System.out.println(Arrays.toString(numbers));
//        }
        int matrixSize = 5;
        int[][] numbers2 = new int[matrixSize][matrixSize];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = CommonInputUtils.getInstance().createRandomIntArray(matrixSize, 0, 9);
            System.out.println(Arrays.toString(numbers2[i]));
        }
        for (int row = 0; row < numbers2.length; row++) {
            int count = 0;
            for (int column = 0; column < numbers2[row].length; column++) {
                if (numbers2[row][column] % 2 == 0) {
                    count++;
                }
            }
            System.out.println("numbers2[row][column] % 2==0: "
                    + count
                    + "\tnumbers2[row][column] % 2==1: "
                    + (numbers2[row].length - count));
        }
    }
}
