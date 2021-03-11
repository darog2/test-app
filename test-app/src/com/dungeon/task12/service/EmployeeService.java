package com.dungeon.task12.service;

import com.dungeon.task12.dao.EmployeeDao;
import com.dungeon.task12.model.Employee;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class EmployeeService {
    public static final String FILE = "E:\\IdeaProjects\\test-app2\\test-app\\resources\\task12\\employees.txt";
    private final EmployeeDao employeeDao;

    public EmployeeService() {
        employeeDao = new EmployeeDao();
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(EmployeeDao.FILE))){
            employees = employeeDao.getAllEmployees(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public void saveEmployees(List<Employee> employees)  {
        try (FileWriter writer = new FileWriter(FILE)){
            employeeDao.saveEmployees(employees, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
