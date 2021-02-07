package com.dungeon.task6;

public class Vacancy {
    public Vacancy( String jobName,int age,double experience,boolean education ){
        this.jobName=jobName;
        this.age=age;
        this.experience=experience;
        this.education=education;
    }
    public Vacancy(String jobName,int age){
        this(jobName, age,0,false);
    }


    public Vacancy() {
    }

    public String jobName;
    public int age;
    public double experience;
    public boolean education;

}
