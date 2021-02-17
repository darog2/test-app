package com.dungeon.task12;

import java.util.ArrayList;
import java.util.List;

public class Project {
     private String projectName;
     private int monthlyBudget;
     private List<Employee> employees = new ArrayList<>();

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(int monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
