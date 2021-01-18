package com.academy.telesens.Lesson2;

public class Conditions {
    public static void main(String[] args) {
        int age = 10;

        if (age < 18){
            System.out.println("Child");
        }
        else
            System.out.println("Adult");


        if (age < 18){
            System.out.println("Child");
        }
        else if (age > 70){
            System.out.println("Old");
        }
            System.out.println("Adult");

    }
}
