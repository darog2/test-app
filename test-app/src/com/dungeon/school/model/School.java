package com.dungeon.school.model;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long id;


    private String name;
    private String address;
    private String city;
    private String country;
    private Teacher director;
    private List<Group> groupList;
    private List<Teacher> teacherList;


    public School() {
        this.teacherList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Teacher getDirector() {
        return director;
    }

    public void setDirector(Teacher director) {
        this.director = director;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
