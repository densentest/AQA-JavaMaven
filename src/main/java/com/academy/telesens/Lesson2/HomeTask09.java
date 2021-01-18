package com.academy.telesens.Lesson2;

//	Нарисовать треугольник заданной размерности. Пример для размера 6:
//            *
//            **
//            ***
//            ****
//            *****
//            ******

import java.util.Scanner;

public class HomeTask09 {
    public static void main(String[] args) {
        System.out.println("Введите размерномть треугольника: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        for (int i=0; i < count; i++){
            for (int j=0; j < count; j++){
                if ( j == 0 || j == i || i >j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
