package com.academy.telesens.Lesson3_4;

import java.util.Arrays;
import java.util.Scanner;

//
//1) Напишите программу, которая:
//        - считывает строку
//        - выводит исходную строку
//        - выводит количество и список слов, которые начинаются на букву 'd'

public class HomeClass1 {
    public static void main(String[] args) {
    ReadStringAndCountWordsStartsWithD();
    }

    public  static void ReadStringAndCountWordsStartsWithD (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество слов, которое вы собираетесь ввести: ");
        int arrayLenth = scanner.nextInt();
        System.out.println();
        String[] allWords = new String[arrayLenth];

        for (int i = 0; i < arrayLenth; i++){
            System.out.println("Введите слово №" + (i+1));
            allWords[i] = scanner.next();
        }
        String allWordsToString = Arrays.toString(allWords);
        System.out.println(String.format("Вы ввели следующие слова: %s", allWordsToString));

        int countWordsStartsWithD =0;
        System.out.println("\nСлова которые начинаются на букву D: ");
        for (int k=0; k <allWords.length; k++){
            if(allWords[k].startsWith("d")){
                countWordsStartsWithD++;
                System.out.println(allWords[k]);
               }
            else {
                System.out.println(String.format("Слово ' %s ' не начинается на букву D", allWords[k]));
            }

        }

        System.out.println(String.format("\nКоличество слов, которые начинаются на букву D: %d", countWordsStartsWithD));
       // System.out.println(String.format("Список слов, которые начинаются на букву D %d: ", Arrays.toString(arraysWordsStartsWithD)));

    }
}
