package com.academy.telesens.Lesson9_Exceptions.HomeTask;

import com.academy.telesens.lesson6_abstraction.HomeTask.CustomDateTime;

import java.util.Scanner;

public class MainForDateTime {
    public static void main(String[] args) {
        CustomDateTime dateTime = new CustomDateTime();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите час: ");
        dateTime.setHour(scanner.nextInt());

        System.out.println("Введите минуту: ");
        dateTime.setMinute(scanner.nextInt());

        System.out.println("Введите секунду: ");
        dateTime.setSecond(scanner.nextInt());

        System.out.println(new CustomDateTime(dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond()).getFormatedTime());
    }
}
