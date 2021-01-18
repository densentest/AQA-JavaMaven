package com.academy.telesens.lesson1;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        Integer age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your sex(male/female): ");
        String sex = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("\n\n\nCongratulations!!! You're successfully registered\n Here is your data:\n");
        System.out.println(String.format(" Name: %s\n Surname: %s\n Sex: %s\n Phone number: %s\n", name, surname, sex, phoneNumber));


    }
}
