package com.dungeon.school.model;

public class Student {
    private String fistName;
    private String lastName;
    private int age;

    public Student(String fistName, String lastName, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student() {
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
