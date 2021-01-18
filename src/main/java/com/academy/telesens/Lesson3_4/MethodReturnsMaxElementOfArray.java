package com.academy.telesens.Lesson3_4;

import java.util.Arrays;
import java.util.Scanner;

public class MethodReturnsMaxElementOfArray {
    public static void main(String[] args) {

        System.out.println(ReturnsMaxElement());

    }

    public  static int ReturnsMaxElement (){
        System.out.println("Введите размерность массива: ");
        Scanner scanner = new Scanner(System.in);
        int count1 = scanner.nextInt();
        int[] array = new int[count1];

        for (int i=0; i < count1; i++){
            System.out.println(String.format("Введите %dй элемент массива: ", i+1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Вы ввели следующий массив: ");
        System.out.println(Arrays.toString(array));

        int maxElement=0;
        for (int j=0; j<array.length; j++){
            if (array[j] > maxElement){
                maxElement = array[j];
            }
        }
        return maxElement;
    }

}
