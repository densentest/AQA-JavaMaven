package com.academy.telesens.Lesson2;

import java.util.Scanner;

//	Нарисовать квадрат заданного размера. Пример для размера 4:
//            ****
//            *  *
//            *  *
//            ****

public class Hometask08 {
    public static void main(String[] args) {

        System.out.println("Введите размерность квадрата: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        for (int i=0; i<count; i++){
            for (int j=0; j < count; j++){
                if ( i == 0 || j ==0 || i == count-1 || j == count -1){
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}
