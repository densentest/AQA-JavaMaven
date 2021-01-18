package com.academy.telesens.Lesson2;

import java.util.Scanner;

//Ввести число с консоли
//сложить все составляющие числа (e.g. ввели 5 > 1+2+3+4+5)

public class Lessontask3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int enteredValue = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= enteredValue; i++){

            sum += i;

        }

        System.out.println(sum);
    }
}
