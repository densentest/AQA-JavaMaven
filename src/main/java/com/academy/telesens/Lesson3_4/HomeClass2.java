package com.academy.telesens.Lesson3_4;


import java.util.Arrays;
import java.util.Scanner;


//2) Напишите программу, которая:
//        - считывает строку
//        - выводит исходную строку
//        - выводит количество и список слов, которые заканчиваются буквами 'ED'


public class HomeClass2 {
    public static void main(String[] args) {
    ReadStringAndCountWordsEndsWithED();

    }

    public  static void ReadStringAndCountWordsEndsWithED (){
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

        int countWordsEndsED =0;

        for (int k=0; k <allWords.length; k++){
            if(allWords[k].endsWith("ed")){
                countWordsEndsED++;
                System.out.println(String.format("Слово %s заканчивается на 'ed'",allWords[k]));
            }
            else {
                System.out.println(String.format("Слово ' %s ' не заканчивается на 'ed'", allWords[k]));
            }

        }

        System.out.println(String.format("\nКоличество слов, которые заканчиваются на 'ed': %d", countWordsEndsED));
        // System.out.println(String.format("Список слов, которые начинаются на букву D %d: ", Arrays.toString(arraysWordsStartsWithD)));



    }
}
