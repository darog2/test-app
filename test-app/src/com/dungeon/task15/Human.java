package com.dungeon.task15;

public class Human implements Comparable<Human>{
    private String name;
    private String lastName;
    private String city;
    private String state;
    private int age;
    private double salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Human(String name, String lastName, String city, String state, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getFullName() {
        return name+" "+lastName;
    }

    @Override
    public String toString() {
        return
                name + " "
                        + lastName +" city: "
                        + city + "(" + state + ')' +
                " age=" + age +
                " salary=" + salary;
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }
}
