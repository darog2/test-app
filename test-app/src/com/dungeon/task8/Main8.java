package com.dungeon.task8;

import com.dungeon.common.CommonInputUtils;

public class Main8 {
    public static void main(String[] args) {
        String reverse = CommonInputUtils.getInstance().readLine("введите строку");
        char[] symbols = reverse.toCharArray();
//        for (int i = 0; i < symbols.length/2; i++) {
//            //формула для 1 половины
//            char temp = symbols[i];
//            symbols[i] = symbols[symbols.length - i - 1];
//            symbols[symbols.length - i - 1] = temp;
//        }

        int half = symbols.length / 2;
        int secondPart = half + symbols.length % 2;
        for (int i = 0; i < symbols.length / 4; i++) {
            //формула для 1 половины
            char temp = symbols[i];
            symbols[i] = symbols[half - i - 1];
            symbols[half - i - 1] = temp;

            //формула для 2 половины
            temp = symbols[1 + half + i];
            symbols[half + 1 + i] = symbols[symbols.length - i - 1];
            symbols[symbols.length - i - 1] = temp;
        }
        reverse = String.valueOf(symbols);
        System.out.println("!" + reverse + "!");
    }
}
