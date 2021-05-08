package com.dungeon.animals;

import com.dungeon.animals.fauna.Animal;
import com.dungeon.animals.fauna.Cat;
import com.dungeon.animals.fauna.Dog;
import com.dungeon.animals.fauna.Fish;
import com.dungeon.animals.fauna.GoingAndSwimmingAnimal;
import com.dungeon.animals.fauna.GoingAnimal;
import com.dungeon.animals.fauna.Horse;
import com.dungeon.animals.fauna.Kolibri;
import com.dungeon.animals.fauna.Penguin;
import com.dungeon.animals.fauna.Snake;
import com.dungeon.animals.fauna.SwimmingAnimal;
import com.dungeon.animals.movement.LandMovementMethod;
import com.dungeon.animals.movement.Move;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {
        List<Animal> animals = new LinkedList<>();
        Move land = new LandMovementMethod();
        Animal dog = new Dog();
        Animal cat = new Cat(land);
        Animal penguin = new Penguin();
        Animal snake = new Snake();
        Animal kolibri = new Kolibri();
        Animal horse = new Horse(land);
        animals.add(snake);
        animals.add(dog);
        animals.add(cat);
        animals.addAll(Arrays.asList(penguin, kolibri, horse));
        animals.add(new Fish());
        GoingAndSwimmingAnimal dogg = new Dog();
        dogg.go();
        dogg.swim();
        List<GoingAnimal> goingAnimals = new ArrayList<>();
        goingAnimals.add(dogg);
        goingAnimals.get(0).go();
        List<SwimmingAnimal> swimmingAnimals = new ArrayList<>();
        swimmingAnimals.add(dogg);
        swimmingAnimals.get(0).swim();
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
