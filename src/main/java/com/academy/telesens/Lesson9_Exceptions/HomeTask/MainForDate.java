package com.academy.telesens.Lesson9_Exceptions.HomeTask;

import com.academy.telesens.Lesson5_OOP.Hometasks.CustomDate;

import java.util.Scanner;

public class MainForDate {
    public static void main(String[] args) {
        CustomDate fullDate = new CustomDate();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите день: ");
        fullDate.setDay(scanner.nextInt());

        System.out.println("Введите месяц: ");
        fullDate.setMonth(scanner.nextInt());

        System.out.println("Введите год: ");
        fullDate.setYear(scanner.nextInt());

        System.out.println(new CustomDate(fullDate.getDay(), fullDate.getMonth(), fullDate.getYear()).getFormattedDate());

    }
}
