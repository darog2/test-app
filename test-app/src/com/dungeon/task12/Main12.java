package com.dungeon.task12;

import com.dungeon.task12.dao.EmployeeDao;
import com.dungeon.task12.model.Employee;
import com.dungeon.task12.model.Project;
import com.dungeon.task12.service.EmployeeService;

import java.util.List;

public class Main12 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Daria");
        employee.setPosition("Python_developer");
        employee.setSalary(1330);
        System.out.println(employee.toString());

        EmployeeService employeeService = new EmployeeService();
        List<Employee> employees = employeeService.getAllEmployees();
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
        employeeService.saveEmployees(employees);
    }
}
