package com.dungeon.task12;

import com.dungeon.task12.dao.EmployeeDao;
import com.dungeon.task12.model.Employee;
import com.dungeon.task12.model.Project;
import com.dungeon.task12.model.Skill;
import com.dungeon.task12.model.SkillType;
import com.dungeon.task12.service.EmployeeService;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main12 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Daria");
        employee.setPosition("Java_developer");
        employee.setSalary(1330);
        System.out.println(employee.toString());
        Skill skill= new Skill("java core",1.3, SkillType.EASY);
        Skill skill1=new Skill("Spring framework",1,SkillType.MEDIUM);
        Skill skill2= new Skill("ANTLR5",1,SkillType.ADVANCED);
        employee.getSkills().add(skill);
        employee.getSkills().add(skill1);
        employee.getSkills().add(skill2);

        EmployeeService employeeService = new EmployeeService();
        List<Employee> employees = employeeService.getAllEmployees();
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
        employeeService.saveEmployees(employees);

        System.out.println();


    }
}
