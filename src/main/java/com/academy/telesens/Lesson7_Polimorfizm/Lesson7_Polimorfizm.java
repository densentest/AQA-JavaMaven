package com.academy.telesens.Lesson7_Polimorfizm;

import com.academy.telesens.Lesson5_OOP.OOP.Person;
import com.academy.telesens.Lesson5_OOP.OOP.Subscriber;

import java.util.Arrays;

public class Lesson7_Polimorfizm {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(array));

        Object[] array1 = {1, "Two", 3};
        System.out.println(Arrays.toString(array)); //даже можно положить какой-то метод который возвращает строку

        Subscriber subscriber = new Subscriber();
        subscriber.setFirstName("Den");
        subscriber.setPhoneNumber("12456");

        System.out.println(subscriber.getProfile());
        System.out.println("*********");

        Person person = new Boxer();
        person = subscriber; // персон должен быть родителем. Это как int в лонг
        // subscriber = person  - так низя. Это как в int попытаться запихнуть long
        System.out.println(person.getProfile());


        Person person2 = new Boxer();
        Boxer boxer = (Boxer) person2;


    }
}
