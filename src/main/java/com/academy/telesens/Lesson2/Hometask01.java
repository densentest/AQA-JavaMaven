package com.academy.telesens.Lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask01 {
    public static void main(String[] args) {
        int[] array = new int[3];

        System.out.println("Введите первое целое число:");
        Scanner scanner = new Scanner(System.in);
        array[0] = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        array[1] = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        array[2] = scanner.nextInt();

        Arrays.sort(array);
//        String arrayToString = Arrays.toString(array);
//        System.out.println(arrayToString);

        System.out.println(String.format(" Минимальоне число: %d\n Среднее число: %d\n Максимальное число: %d",
                array[0], array[1], array[2]));





    }
}
