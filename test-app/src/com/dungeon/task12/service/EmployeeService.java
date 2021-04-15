package com.dungeon.task12.service;

import com.dungeon.task12.dao.EmployeeDao;
import com.dungeon.task12.model.Employee;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class EmployeeService {
    public static final String FILE = "task12/employees.txt";
    private final EmployeeDao employeeDao;

    public EmployeeService() {
        employeeDao = new EmployeeDao();
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new LinkedList<>();
        try {
            Path path = Paths.get(ClassLoader.getSystemResource(FILE).toURI());

            BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
            employeeList = employeeDao.getAllEmployees(reader);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    public void saveEmployees(List<Employee> employees) {
        try {
            String file = "task15.txt";
//            Path path = Paths.get(ClassLoader.getSystemResource("task15/"+file).toURI());
            String FILE = "check_" + System.currentTimeMillis() + "__.txt";
            FileWriter writer = new FileWriter(FILE);
            employeeDao.saveEmployees(employees, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
