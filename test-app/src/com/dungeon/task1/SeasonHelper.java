package com.dungeon.task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class SeasonHelper {

    public String selectSeason(String month) {
        String winter = "зима";
        String summer = "лето";
        String spring = "весна";
        String autumn = "осень ";


        switch (month) {
            case "январь":
            case "февраль":
            case "декабрь":
                return winter;
            case "март":
            case "апрель":
            case "май":
                return spring;
            case "июнь":
            case "июль":
            case "август":
                return summer;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                return autumn;
            default:
                return "неверное значение и ты лох что не попал ";
        }
    }
     public String getMonthNameByMonthNumber(int monthNumber){
         switch (monthNumber){
             case 1: return "январь";
             case 2: return "февраль";
             case 3: return "март";
             case 4: return "апрель";
             case 5: return "май";
             case 6: return "июнь";
             case 7: return "июль";
             case 8: return "август";
             case 9: return "сентябрь";
             case 10: return "октябрь";
             case 11: return "ноябрь";
             case 12: return "декабрь";
             default : return "хуямбер";

         }
     }
}
