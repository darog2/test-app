package com.dungeon.task14;

import com.dungeon.task14.model.Client;
import com.dungeon.task14.model.Employee;
import com.dungeon.task14.model.Human;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("John",
                "john.doe@mail.cc",
                "+1000654541",
                35,
                "18/12/2019");
        Employee employee = new Employee("Jack",
                "jack.88887@mail.com",
                "+16574564567",
                22,
                "cashier",
                450);
        System.out.println(client.toString());
        System.out.println(employee.toString());
        List<Human> humans = new LinkedList<>();
        System.out.println("---------------------------");
        humans.add(employee);
        humans.add(client);
        client.getProductsBought().add("Bananas");
        client.getProductsBought().add("Fish");
        client.getProductsBought().add("Apples");
        humans.forEach(human -> System.out.println(human.toString()));
//        Human human1 = new Human("Jack",
//                "jack.88887@mail.com",
//                "+16574564567",
//                22) {
//            @Override
//            public void tellSomething() {
//                System.out.println("i am human");
//            }
//        };
//        humans.add(human1);
        for (Human human : humans) {
            human.tellSomething();
            System.out.println(human.getClass().getName());
        }


        System.out.println(Math.sqrt(-50.));


    }
}
