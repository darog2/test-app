package com.dungeon.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {
        List<Animal> animals= new ArrayList<>();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal penguin = new Penguin();
        Animal parrot  = new Kolibri();
        animals.add(dog);
        animals.add(cat);
        animals.addAll(Arrays.asList(penguin,parrot));
        animals.add(new Fish());
//        for (int i = 0; i < animals.size() ; i++) {
//            Animal animal = animals.get(i);
//            animal.voice();
//        }
        for (Animal animal : animals) {
            animal.move();
        }
//        animals.forEach(animal -> animal.go());
    }
}
