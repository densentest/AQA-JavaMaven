package com.academy.telesens.Lesson2;

import java.util.Scanner;

public class HomeTask04 {
    public static void main(String[] args) {
        int number;


        System.out.println("Введите ДВУХЗНАЧНОЕ число:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        Integer y = new Integer(number);
        String numberToString = y.toString(number);
        //System.out.println(numberToString);

        if (numberToString.length() == 2){
            System.out.println(String.format("Вы ввели: %d", number));
            int firstNumber = number/10;
            int secondNumber = number%10;
            System.out.println(String.format("Первая цифра введенного числа: %d,\n" +
                    "Вторая цифра введеного числа: %d", firstNumber, secondNumber));
            int sum = firstNumber + secondNumber;
            System.out.println(String.format("Сумма первого и второго числа = %d", sum));
        } else {
            System.out.println(String.format("Вы ввели не двухзначное число!\nПопробуйте еще раз"));
        }


    }
}
