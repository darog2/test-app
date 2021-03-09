package com.dungeon.task12;

public class Main12 {
    public static void main(String[] args) {
        Employee vasya = new Employee();
        vasya.setName("петушканчик");
        vasya.setPosition("матрос");
        vasya.setSalary(300);
        System.out.println(vasya.toString());
        Employee employee= new Employee();
       employee.setName("dasha");
       employee.setPosition("уборщик");
       employee.setSalary(330);
        System.out.println(employee.toString());
        Project project=new Project();
        project.setProjectName("Fishing");
        project.setMonthlyBudget(600);
        project.getEmployees().add(vasya);
        project.getEmployees().add(employee);
        System.out.println(project.toString());
    }
}
