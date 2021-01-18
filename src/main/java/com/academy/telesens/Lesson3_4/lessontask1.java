package com.academy.telesens.Lesson3_4;


import java.util.Arrays;

//Вывести буквы от a до z не задавая их значения
public class lessontask1 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++ ){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 'a'; i <= 'z'; i++ ){
            System.out.print((char) i);
            System.out.print(" ");
        }

// метод сравнения .equals
        String[] words1 = {"One", "Two", "Three"};
        String[] words2 = {"One", "Two", "Three"};
        System.out.println();
        System.out.println(Arrays.equals(words1, words2));
    }


}
