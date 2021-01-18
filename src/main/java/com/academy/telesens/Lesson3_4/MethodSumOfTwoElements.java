package com.academy.telesens.Lesson3_4;

import java.util.Scanner;

public class MethodSumOfTwoElements {

    public static void main(String[] args) {

        System.out.println(String.format("Введите первое число: "));
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println(String.format("Введите второе число: "));
        int secondNumber = scanner.nextInt();

        int sum = MethodSumOfTwoElements(firstNumber, secondNumber);

        System.out.println(String.format("Вы ввели %d и %d. Сумма этих чисел равна %d", firstNumber, secondNumber, sum));

    }

    public static int MethodSumOfTwoElements (int number1, int number2){
        int sum;
        sum = number1 + number2;
        return sum;
    }
}

