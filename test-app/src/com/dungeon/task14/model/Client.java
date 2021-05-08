package com.dungeon.task14.model;

import java.util.ArrayList;
import java.util.List;

public class Client extends Human {
    private String registrationDate;
    private List<String> productsBought;

    public Client(String name, String email, String phone, int age) {
        super(name, email, phone, age);
        productsBought = new ArrayList<>();
    }

    public Client(String name, String email, String phone, int age, String registrationDate) {
        super(name, email, phone, age);
        this.registrationDate = registrationDate;
        productsBought = new ArrayList<>();
    }

    @Override
    public void tellSomething() {
        System.out.println("i am client");
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<String> getProductsBought() {
        return productsBought;
    }

    @Override
    public String toString() {
        return "Client{" +
                "registrationDate='" + registrationDate + '\'' +
                ", productsBought=" + productsBought +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
