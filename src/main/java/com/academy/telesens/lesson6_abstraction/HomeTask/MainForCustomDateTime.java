package com.academy.telesens.lesson6_abstraction.HomeTask;

import java.util.Scanner;

public class MainForCustomDateTime {
    public static void main(String[] args) {
        CustomDateTime fullDate = new CustomDateTime();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день: ");
        fullDate.setDay(scanner.nextInt());

        System.out.println("Введите месяц: ");
        fullDate.setMonth(scanner.nextInt());

        System.out.println("Введите год: ");
        fullDate.setYear(scanner.nextInt());

        System.out.println("Введите текущее время: ");

        System.out.println("Введите час: ");
        fullDate.setHour(scanner.nextInt());
        System.out.println("Введите минуту: ");
        fullDate.setMinute(scanner.nextInt());
        System.out.println("Введите секунду: ");
        fullDate.setSecond(scanner.nextInt());

        System.out.println("Введите формат для отображения времени. 12 или 24");
        fullDate.setDateFormat(scanner.nextInt());

        String finalDate = fullDate.getFormattedDateBasedOnDateFormat();
        System.out.println(finalDate);

    }
}
