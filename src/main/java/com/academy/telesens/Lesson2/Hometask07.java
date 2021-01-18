package com.academy.telesens.Lesson2;

import java.util.Arrays;
import java.util.Scanner;

//
//	Проинициализировать одномерный массив произвольными целыми числами
//            Вывести массив в виде, например:
//            [3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17]
//            a) используя цикл for
//            b) используя цикл while

public class Hometask07 {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Вы ввели следующие числа: ");
        System.out.println(Arrays.toString(array));


        int[] array1 = new int[5];
                int i = 0;
        while (i < array1.length) {
            System.out.println("Введите число " + (i+1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Вы ввели следующие числа: ");
        System.out.println(Arrays.toString(array1));
    }
}
