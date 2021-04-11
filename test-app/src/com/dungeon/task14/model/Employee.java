package com.dungeon.task14.model;

public class Employee extends Human{
    private String position;
    private double salary;

    public Employee(String name, String email, String phone, int age) {
        super(name, email, phone, age);
    }

    @Override
    public void tellSomething() {
        System.out.println("i am employee");
    }

    public Employee(String name,
                    String email,
                    String phone,
                    int age,
                    String position,
                    double salary) {
        super(name, email, phone, age);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
