package com.academy.telesens.Lesson5_OOP.OOP;

import com.academy.telesens.Lesson7_Polimorfizm.Gender;

public class MainClass {
    public static void main(String[] args) {
        Person me = new Person();
        me.setFirstName("Den");
        me.setLastName("Sennikov");
        me.setAge(28);
        me.setGender(Gender.MALE);

        String finalStringofMe =  me.getProfile();
        System.out.println(finalStringofMe);


        Person me1 = new Person("Den", "Sennikov", 28, Gender.MALE);
        String finalStringOfMe1 = me1.getProfile();
        System.out.println(finalStringOfMe1);


    }
}
