package com.dungeon.task4;

public class AgeHelper {
    public String getAgeCategory (int age){
        if (age<0){
            return "тебя не существует";
        }
        if (0<=age && age<12) {
            return "ребенок";
        }
        if (age >= 13 && age <= 17) {
            return "подросток";
        }
        if (age >= 18 && age <=23){
            return "студент";
        }
        if (age >= 24 && age <=45){
            return "взрослый";
        }
        if (age >= 46 && age <=59){
            return "в возрасте";
        }
        if (age >= 60 && age <=70){
            return "пенсионер";
        }
        if (age >= 71 && age <=100) {
            return "старик";
        }
        if ( age > 100){
            return "бесмертный";
        }
        return "еще не готово";
    }
}
