package com.academy.telesens.Lesson2;

import java.util.Scanner;

public class Hometask02 {
    public static void main(String[] args) {
        System.out.println("Введите ваш вес на земле, кг:");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();


        System.out.println(String.format("Ваш вес на Земле: %.1f кг", weight));

        double weightMoon = weight * 0.17;
        System.out.println(String.format("Ваш вес на Луне: %.1f", weightMoon));
    }
}
