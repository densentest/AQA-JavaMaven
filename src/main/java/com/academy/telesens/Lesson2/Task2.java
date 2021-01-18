package com.academy.telesens.Lesson2;

public class Task2 {
    public static void main(String[] args) {

        int age = 90;
        if (age <= 0){
            System.out.println("Возраст не может быть <= 0 ");
        }
        else if ( (1 <= age) && (age <=18)){
            System.out.println("Несовершеннолетний");
        }
        else  if ( (19 <= age) && (age <=89)){
            System.out.println("Взрослый");
        }
        else{
            System.out.println("Долгожитель");
        }


    }
}
