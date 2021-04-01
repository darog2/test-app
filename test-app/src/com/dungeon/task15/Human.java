package com.dungeon.task15;

public class Human {
    private String name;
    private  String lastName;
    private String city;
    private  String state;

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

    public Human(String name, String lastName, String state, String city) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
    }
}