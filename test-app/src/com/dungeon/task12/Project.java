package com.dungeon.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Project {
    private static final String PROJECT_OUTPUT_TEMPLATE
            = "projectName\t= %s\nmonthlyBudget\t= %d\nemployees:\n%s\n";
     private String projectName;
     private int monthlyBudget;
     private final List<Employee> employees;

    public Project() {
        employees = new ArrayList<>();
    }

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

    @Override
    public String toString() {
        return String.format(PROJECT_OUTPUT_TEMPLATE,
                projectName,
                monthlyBudget,
                employees.toString());
//                employees.stream().map(Employee::toString).collect(Collectors.joining("\n"))) ;
    }
}
