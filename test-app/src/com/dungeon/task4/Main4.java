package com.dungeon.task4;

import com.dungeon.common.CommonInputUtils;

public class Main4 {
    public static void main(String[] args) {
        int age = CommonInputUtils.getInstance().readInt("введите возраст");
        AgeHelper helper = new AgeHelper();
        String answer = helper.getAgeCategory(age);
        System.out.println(answer);
    }
}
