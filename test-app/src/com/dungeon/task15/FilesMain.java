package com.dungeon.task15;

import com.dungeon.task15.util.PersonCreator;
import com.dungeon.task15.util.PersonCreatorBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilesMain {
    public static void main(String[] args) throws Exception {
        List<Human> randomHumans = createRandomHumans(20000);
        /***принтит всех
         *randomHumans.forEach(human -> System.out.println(human.toString()));//одно и тоже
         *randomHumans.forEach(System.out::println);//
         */
//
        /*** выбирает всех людей которые живут в ойдахо ИЛИ огайо
         * randomHumans.stream()
         *        .filter(human -> human.getState().equals("Ohio")
         *                || human.getState().equals("Idaho"))
         *        .forEach(System.out::println);
         */
//        randomHumans.stream()
//                .filter(human ->human.getAge()>30
//                && human.getSalary()<1500)
//                .forEach(System.out::println);
//        randomHumans.stream()
//                .filter(human -> human.getState().equals("California"))
//                        .forEach(System.out::println);
//        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
//        randomHumans.stream()
//                .filter(human -> human.getState().equals("California"))
//                .peek(human -> human.setSalary( human.getSalary() * 1.11))
//                .forEach(System.out::println);
        class StateSalary{
            private String state;
            private double salary;

            @Override
            public String toString() {
                return "StateSalary{" +
                        "state='" + state + '\'' +
                        ", salary=" + salary +
                        '}';
            }

            public StateSalary(String state, double salary) {
                this.state = state;
                this.salary = salary;
            }
        }
//        randomHumans.stream()
//                .filter(human -> human.getAge()>90)
//                .peek(System.out::println)
//                .map(human -> new StateSalary(human.getState(), human.getSalary()))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//        randomHumans.stream()
//                .filter(human -> human.getState().equals("Texas"))
//                .peek(System.out::println)
//                .collect(Collectors.toList())
//                .stream()
//                .peek(human -> human.setSalary(human.getSalary()*0.5))
//                .peek(human -> human.setAge(human.getAge()+25))
//                .forEach(System.out::println);
        Comparator<Human> humanComparator = Comparator.comparing(Human::getFullName);
        randomHumans.stream()
                .filter(human -> human.getAge()>50)
                .filter(human -> human.getState().equals("Illinois"))
                .filter(human -> human.getSalary()>4000)
                .sorted(humanComparator)
                .forEach(System.out::println);
        System.out.println();
    }


    private static List<Human> createRandomHumans(int count) {
        List<Human> humanList = new ArrayList<>();
        try {
            PersonCreator personCreator =
                    new PersonCreatorBuilder()
                            .cities()
//                    .firstNames("Vasya", "Kostyan")
                            .firstNames()
                            .lastNames()
                            .build();
//            Human human = personCreator.randomHuman();
            for (int i = 0; i < count; i++) {
                humanList.add(personCreator.randomHuman());
            }

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return humanList;
    }
}
