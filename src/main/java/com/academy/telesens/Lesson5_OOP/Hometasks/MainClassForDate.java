    package com.academy.telesens.Lesson5_OOP.Hometasks;

    import java.util.Scanner;

    public class MainClassForDate {
        public static void main(String[] args) {
            CustomDate fullDate = new CustomDate();
            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите день: ");
            fullDate.setDay(scanner.nextInt());

            System.out.println("Введите месяц: ");
            fullDate.setMonth(scanner.nextInt());

            System.out.println("Введите год: ");
            fullDate.setYear(scanner.nextInt());

            String finalDate = fullDate.getFormattedDate();
            System.out.println(finalDate);

            //  System.out.println(fullDate);
            System.out.println(new CustomDate(fullDate.getDay(), fullDate.getMonth(), fullDate.getYear()).getFormattedDate());

        }
    }
