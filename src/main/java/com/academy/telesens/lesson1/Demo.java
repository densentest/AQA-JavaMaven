package com.academy.telesens.lesson1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");


        System.out.print("1\n");
        System.out.print("2");
        System.out.print("3\n");

// устаревший способ форматирвоания текста
        System.out.printf("My name is %s Surname is %s%n", "Den", "Sen"); //the same as print

// форматировние строк. Более правильный метод
        System.out.println(String.format("My name is %s. My Surname is %s. I'm %d years old", "Den", "Sen", 28));




        // ввод с консоли
        System.out.print("Введите ваше имя");
        Scanner scanner= new Scanner(System.in); //настраиваем сканер
        String name = scanner.nextLine();// считываем с консоли. Тип - строка
        Integer age = scanner.nextInt();// считываем с консоли. Тип - целое число
        System.out.println(String.format("ПРивет %s", name)); // выводим на консоль
    }
}
