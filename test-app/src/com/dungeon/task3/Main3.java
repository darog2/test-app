package com.dungeon.task3;

public class Main3 {
    public static void main(String[] args) {
        Human vasya = new Human();
        //Вася, иди сюда!
        vasya.goThere();
        //Вася, идём курить!
        vasya.goSmoking();
        //Вася, иди нахуй!
        vasya.fuckYou();
        //Серега, сьезди в магазин!
        Human serega = new Human();
        serega.goToTheShop();
        //Серега, иди домой!
        serega.goHome();
        //Даша, купи кофе!
        Human dasha = new Human();
        Coffee myCoffee = dasha.goBuyCoffee();
        //вася,позови кассира!!
        vasya.callTheCashier();
        //даша,помой посуду!!
        dasha.goWashTheDishe();
        //Серега, купи продукты для супа!!
        Meat meat = serega.goBuyMeat();
        Cucumber cucumber = serega.goBuyCucumber();
        Tomato tomato = serega.goBuyTomato();
        Potato potato = serega.goBuyPotato();
        Onion onion = serega.goBuyOnion();
        Soup soup = dasha.cookTheSoup(meat, potato, onion, cucumber,tomato);




    }
}
