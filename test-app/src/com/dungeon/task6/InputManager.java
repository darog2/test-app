package com.dungeon.task6;

import java.util.Scanner;

public class InputManager {

    private final Scanner scanner;

    public InputManager(Scanner scanner) {

        this.scanner = scanner;
    }

    public Vacancy inputVacancy() {
        System.out.println("Ввод параметров вакансии");
        Vacancy vacancy = new Vacancy();
        System.out.print("введите название вакансии ");
        vacancy.jobName = scanner.nextLine();
        System.out.print("введите минимальный требуемый возраст ");
        vacancy.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("введите опыт работы ");
        vacancy.experience = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("введите ваше образование ");
        String education = scanner.nextLine();
        if (education.equals("да")
                || education.equals("есть")
                || education.equals("имеется")) {
            vacancy.education = true;
        }
        return vacancy;
    }


     public Applicant inputApplicant (){
         System.out.println("Ввод параметров соискателя");
         Applicant applicant = new Applicant();
         System.out.print("введите ваше имя ");
         applicant.name = scanner.nextLine();
         System.out.print("введете ваш возраст ");
         applicant.age = scanner.nextInt();
         scanner.nextLine();
         System.out.print("введите наличие вашего опыта ");
         applicant.experience = scanner.nextDouble();
         scanner.nextLine();
         System.out.print("введите наличие вашего образования ");
         String education = scanner.nextLine();
         if (education.equals("да")
                 || education.equals("есть")
                 || education.equals("имеется")) {
             applicant.education = true;
         }
         return applicant;
     }

}
