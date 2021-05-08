package com.dungeon.school.model;

import java.util.List;

public class Teacher {
    private String fistName;
    private String lastName;
    private List<Subject> listSubject;

    public Teacher(String fistName, String lastName, List<Subject> listthing) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.listSubject = listthing;
    }

    public Teacher() {
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Subject> getListSubject() {
        return listSubject;
    }

    public void setListSubject(List<Subject> listSubject) {
        this.listSubject = listSubject;
    }
}
