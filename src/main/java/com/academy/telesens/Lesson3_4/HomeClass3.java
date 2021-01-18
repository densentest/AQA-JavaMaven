package com.academy.telesens.Lesson3_4;

import java.util.Scanner;

public class HomeClass3 {
    public static void main(String[] args) {
        ReadStringOutputSubstringInStringAndCountIt();
    }

    public  static void ReadStringOutputSubstringInStringAndCountIt (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string1 = scanner.nextLine();
        System.out.println("Вы ввели следующую строку: " + string1);

        System.out.println("\nПроверим наличие подстроки java в введенной строке!");

        for (int i = 0; i < string1.length(); i++) {
            int k = string1.indexOf("java");
            if (k >= 0) {
                String substringJava = string1.substring(k, k + 4);
                if (substringJava.equals("java")) {
                    System.out.println("Подстрока " + substringJava + " найдена в строке");
                    break;

                }

            }

        }
        int countsubstring = 0;
        char[] string1ToCharArray = string1.toCharArray();

          for (int i=0; i < string1.length(); i++){
            if ( string1ToCharArray[i] == 'j' && string1ToCharArray[i+1] == 'a' &&
            string1ToCharArray[i+2] == 'v' && string1ToCharArray[i+3] == 'a'){
                countsubstring++;
            }

        }
        System.out.println(String.format("Подстрока 'java' встречается в строке '%s', %d раз(а)",
                string1, countsubstring));


    }
}
