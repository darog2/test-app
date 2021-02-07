package com.dungeon.task5;

public class DriverCategoryCatalog {
    public void printAvailableCategories (int age){
       int categoryA1Age = 16;
       int categoryB1Age = 19;
       int categoryC1Age = 21;
       int categoryD1Age = 25;
       String categoryA1Transport = "легкие мотоциклы";
       String categoryB1Transport = "легковые автомобили";
       String categoryC1Transport = "грузовики";
       String categoryD1Transport = "небольшие автобусы";

       if( age < categoryA1Age){
           System.out.println("иди в школу");
           return;
       }

        printCategory("A1",categoryA1Transport);
        if (age >=categoryB1Age){
            printCategory("B1",categoryB1Transport);
        }
        if (age >=categoryC1Age){
            printCategory("C1",categoryC1Transport);
        }
        if (age >=categoryD1Age){
            printCategory("D1",categoryD1Transport);
        }
    }
    private void printCategory(String name, String transport){
        System.out.println("Вы можете получить категорию "+name+" и ездить на: " + transport);

    }
}
