package com.dungeon.school.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int classNumber;
    private String name;
    private String curator;
    private List<Student> studentList;

    public Group() {
        this.studentList = new ArrayList<>();
    }

    public Group(int classNumber, String name, String curator) {
        this();
        this.classNumber = classNumber;
        this.name = name;
        this.curator = curator;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
