package com.dungeon.task12.dao;

import com.dungeon.task12.model.Employee;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDao {

    public static final String EMPLOYEE_FILE_OUTPUT_TEMPLATE = "%s/%d/%s%n";

    public List<Employee> getAllEmployees(BufferedReader reader) throws IOException {
        List<Employee> employeeList = new LinkedList<>();
        while (reader.ready()) {
            String line = reader.readLine();
            String[] parts = line.split("/");
            String name = parts[0];
            String position = parts[2];
            String salary = parts[1];
            Employee employee = new Employee(name, position, Integer.parseInt(salary));
            employeeList.add(employee);
        }

        return employeeList;
    }

    public void saveEmployees(List<Employee> employeeList,
                              FileWriter writer)
            throws IOException {
        for (Employee employee : employeeList) {
            writer.append(
                    String.format(EMPLOYEE_FILE_OUTPUT_TEMPLATE,
                            employee.getName(),
                            employee.getSalary(),
                            employee.getPosition()));
        }
        writer.flush();
    }
}
