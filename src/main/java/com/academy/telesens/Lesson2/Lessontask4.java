package com.academy.telesens.Lesson2;

import java.util.Arrays;
import java.util.Scanner;
// заполнить массив значениями с калвиатуры и вывести их в обратном порядке

public class Lessontask4 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int j=numbers.length-1; j >= 0; j--){

            System.out.print(numbers[j]+ " ");
        }

    }
}
