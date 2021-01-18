package com.academy.telesens.Lesson2;


//Вывести на таблицу умножения чисел от 1 до 9:
//        1*1 = 1
//        1*2 = 2
//        1*3 = 3
//        ...
//        2*1 = 2
//        2*2 = 4
//        ...
//        9*8 = 72
//        9*9 = 81
public class HomeTask12 {
    public static void main(String[] args) {

        for (int i =1; i <=10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            if (i < 10) {
                System.out.println("****** Таблица умножения на " + (i + 1) + " ********");
            }
        }

    }
}
