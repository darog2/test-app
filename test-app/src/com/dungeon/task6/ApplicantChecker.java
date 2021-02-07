package com.dungeon.task6;

import java.util.Scanner;

public class ApplicantChecker {
    private final Scanner scanner;
    public ApplicantChecker(Scanner scanner){
        this.scanner = scanner;
    }

    private void lightCheckApplicant(Vacancy vacancy, Applicant applicant) {
        if (applicant.age >= vacancy.age
                && (applicant.experience >= vacancy.experience
                || vacancy.education
                && applicant.education)) {
            System.out.println(applicant.name + " подходит для вакансии " + vacancy.jobName);
            return;
        }
        System.out.println(applicant.name + " не подходит для вакансии " + vacancy.jobName);

    }

    private void hardCoreCheckApplicant(Vacancy vacancy, Applicant applicant) {
        if (applicant.age >= vacancy.age
                && applicant.experience >= vacancy.experience
                && (!vacancy.education || applicant.education)) {
            System.out.println(applicant.name + " подходит для вакансии " + vacancy.jobName);
            return;
        }


        System.out.println(applicant.name + " не подходит для вакансии " + vacancy.jobName);

    }

    public void checkApplicant(Vacancy vacancy, Applicant applicant) {
        int choice;
        System.out.println("введите 1 для упрощенной проверки или 2 для более детальной ");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                lightCheckApplicant(vacancy, applicant);
                break;
            case 2:
                hardCoreCheckApplicant(vacancy, applicant);
                break;
            default:
                System.out.println("непраыильный выбор");
                checkApplicant(vacancy, applicant);
                break;

        }
    }
}

