package com.academy.telesens.Lesson3_4;

import java.util.Scanner;

public class MethodPrintReportOfArray {
    public static void main(String[] args) {
        MethodReturnsArrayReport();
    }


    public static void MethodReturnsArrayReport (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int[] array = new int[scanner.nextInt()];


        for (int i=0; i<array.length; i++){
            System.out.println("Введите " + (i+1) + "й элемент массива");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int j=0; j<array.length; j++){
            sum += array[j];
        }

        int maxElement = 0;
        for (int k = 0; k < array.length; k++){
            if (array[k] > maxElement){
                maxElement = array[k];
                }
        }

        int countElements =0;
        for (int l=0; l<array.length; l++){
            if (array[l]%2 == 0){
                countElements++;
            }
        }
        System.out.println("Размер массива: " + array.length);
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Количество четных элементов: "+ countElements);

    }
}
