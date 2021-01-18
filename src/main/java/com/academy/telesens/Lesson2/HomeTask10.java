package com.academy.telesens.Lesson2;

import java.util.Scanner;

//
//	Нарисовать треугольник заданной размерности. Пример для размера 6:
//                 *
//                **
//               ***
//              ****
//             *****
//            ******

public class HomeTask10 {
    public static void main(String[] args) {
        System.out.println("Введите размерномть треугольника: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        for (int i=0; i < count; i++){
            for (int j=0; j < count; j++){
 //               if ( j == count-1 || i == count -1 || (i*j) >= count){
                if ( j < (count - 1 - i)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
