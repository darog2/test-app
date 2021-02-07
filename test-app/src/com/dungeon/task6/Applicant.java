package com.dungeon.task6;

public class Applicant {
    public Applicant(String name,int age,double experience,boolean education){
        this.name=name;
        this.age=age;
        this.experience=experience;
        this.education=education;
    }
    public Applicant(String name,int age){
        this(name,age,0,false);
    }
    public Applicant(){

    }
    public String name;
    public int age;
    public double experience;
    public boolean education;

}

