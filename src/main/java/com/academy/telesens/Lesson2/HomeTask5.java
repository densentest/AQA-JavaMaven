package com.academy.telesens.Lesson2;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {
        int number;


        System.out.println("Введите ТРЕХЗНАЧНОЕ число:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        Integer y = new Integer(number);
        String numberToString = y.toString(number);
        //System.out.println(numberToString);

        if (numberToString.length() == 3){
            System.out.println(String.format("Вы ввели: %d", number));
            int firstNumber = number/100;
            int secondNumber = (number%100)/10;
            int thirdNumber = (number%100)%10;
            System.out.println(String.format("Первая цифра введенного числа: %d,\n" +
                    "Вторая цифра введеного числа: %d\n" +
                    "Третья цифра введеного числа: %d", firstNumber, secondNumber, thirdNumber));
            int sum = firstNumber + secondNumber + thirdNumber;
            System.out.println(String.format("Сумма первого и второго числа = %d", sum));
        } else {
            System.out.println(String.format("Вы ввели не трехзначное число!\nПопробуйте еще раз"));
        }

    }
}
