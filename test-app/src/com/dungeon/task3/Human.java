package com.dungeon.task3;

public class Human {
    public void goThere(){
        System.out.println("Чувак подошёл");
    }
    public void goSmoking(){
        System.out.println("Чувак пошёл с нами курить");
    }
    public void fuckYou(){
        System.out.println("Чувак ушёл нахуй");
    }
    public void goToTheShop(){
        System.out.println("Чувак едет в магазин");
    }
    public void goHome(){
        System.out.println("Чувак идет домой");
    }
    public Coffee goBuyCoffee(){
        System.out.println("идет покупать кофе");
        return new Coffee();
    }
    public void callTheCashier(){
        System.out.println("позвал кассира");
    }
    public void goWashTheDishe(){
        System.out.println("помыла посуду");
    }
    public Meat goBuyMeat(){
        System.out.println("покупает мясо");
        return new Meat();// Meat beef = new Meat(); return beef;
    }
    public Potato goBuyPotato(){
        System.out.println("покупает картошка");
        return new Potato();
    }
    public Onion goBuyOnion(){
        System.out.println("покупает лук");
        return new Onion();
    }
    public Cucumber goBuyCucumber(){
        System.out.println("покупает огурец");
        return new Cucumber();
    }
    public Tomato goBuyTomato(){
        System.out.println("покупает помидор");
        return new Tomato();
    }
        public Soup cookTheSoup(Meat meat, Potato potato, Onion onion, Cucumber cucumber, Tomato tomato){
            System.out.println("готовит суп");
            return new Soup();

        }
}
