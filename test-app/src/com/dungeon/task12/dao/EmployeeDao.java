package com.dungeon.task12.dao;

import com.dungeon.task12.model.Employee;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDao {

    private static final String EMPLOYEE_FILE_OUTPUT_TEMPLATE = "%s %d %s%n";
    public static final String FILE = "E:\\IdeaProjects\\test-app2\\test-app\\resources\\task12\\employees.txt";

    public List<Employee> getAllEmployees(BufferedReader reader) throws IOException {
        List<Employee> employees = new LinkedList<>();
        while (reader.ready()) {
            String line = reader.readLine();
            String[] parts = line.split("\\s");
            Employee employee = new Employee(parts[0], parts[2], Integer.parseInt(parts[1]));
            employees.add(employee);
        }

        return employees;
    }

    public void saveEmployees(List<Employee> employees, FileWriter writer) throws IOException {
        for (Employee employee : employees) {
            writer.append(String.format(EMPLOYEE_FILE_OUTPUT_TEMPLATE,
                    employee.getName(),
                    employee.getSalary(),
                    employee.getPosition()));
        }
        writer.flush();
    }
}
