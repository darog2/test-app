package com.dungeon.task12;

// сотрудник
public class Employee {
    private static final String EMPLOYEE_OUTPUT_TEMPLATE
            = "Name\t= %s\nposition\t= %s\nsalary\t\t= %d\n";
   private String name;
   private String position;
   private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(EMPLOYEE_OUTPUT_TEMPLATE,name,position,salary);
    }
}
