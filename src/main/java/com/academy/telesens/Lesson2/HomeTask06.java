package com.academy.telesens.Lesson2;

import java.util.Scanner;

public class HomeTask06 {
    public static void main(String[] args) {
        int number;
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        Integer y = new Integer(number);
        String numberToString = y.toString(number);

      //  System.out.println(String.format("Вы ввели число: %d", number));

        int numberToStringLength = numberToString.length();
        int sum2 = 0;

        if (numberToStringLength == 1){
            System.out.println(String.format("Вы ввели число: %d. Невозможно посчитать сумму этого числа", number));

        }
            else  if (numberToStringLength == 2){
                int firstNumber = number / 10;
                int secondNumber = number % 10;
                int sum1 = firstNumber + secondNumber;
                System.out.println(String.format("Сумма цифр введенного исла равна: %d",sum1 ));

        }
            else  if (numberToStringLength > 2) {

                for( int n = number; n != 0; n /= 10)
                {

                    sum2 += (n % 10);
                }
                System.out.println(String.format("Сумма цифр введенного исла равна: %d",sum2 ));

            }
        }


    }
