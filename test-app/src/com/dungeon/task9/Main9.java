package com.dungeon.task9;

import com.dungeon.common.CommonInputUtils;

public class Main9 {
    public static void main(String[] args) {
        String result = "";
        String word;
        do {
            word = CommonInputUtils.getInstance().readLine("Введите слово");
            result += word + " ";


        } while (!word.equals("ыход"));
        System.out.println("result = " + result);
    }
}
