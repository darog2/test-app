package com.dungeon.task6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputManager manager = new InputManager(scanner);
//        Vacancy vacancy = manager.inputVacancy();
//        Applicant applicant = manager.inputApplicant();
//        ApplicantChecker helper = new ApplicantChecker(scanner);
//        helper.checkApplicant(vacancy,applicant);
        Vacancy vacancy1=new Vacancy("проститутка",20,2.5,false);
        Applicant applicant2=new Applicant("даша",25,1.7,true);
        Vacancy vacancy2=new Vacancy("сантехник",62);
        Applicant applicant3=new Applicant("Сергей",70);



    }
}


