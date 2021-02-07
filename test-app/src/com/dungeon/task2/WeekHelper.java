package com.dungeon.task2;

import java.util.Scanner;

public class WeekHelper {

    public String dayHelper(int day) {
        String monday = "понедельник";
        String tuesday = "вторник";
        String wednesday = "среда";
        String thursday = "четверг";
        String friday = "пятница";
        String saturday = "субота";
        String syndey = "воскресеенье";
        String result = null;


        switch (day) {
            case 1:
                result = monday;
                break;

            case 2:
                result = tuesday;
                break;

            case 3:
                result = wednesday;
                break;
            case 4:
                result = thursday;
                break;
            case 5:
                result = friday;
                break;
            case 6:
                result = saturday;
                break;
            case 7:
                result = syndey;
                break;
            default:
                result = "неверное значение";
                break;
        }
        return result;


    }

    public String isWeekend(String day) {
        String weekend = "выходной день ";
        String workDay = "рабочий день";
        String result = null;


        switch (day) {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                result = workDay;
                break;
            case "суббота":
            case "восресенье":
                result = weekend;
                break;
            default:
                result = "ты что марсианнин?";
                break;
        }

                return result;
    }
}
