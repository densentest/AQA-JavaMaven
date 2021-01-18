package com.academy.telesens.Lesson5_OOP.OOP;

import com.academy.telesens.Lesson7_Polimorfizm.Gender;

public class DemoForInheritance {
    public static void main(String[] args) {
        Operator operator = new Operator("Kyivstar", "Kyiv");
        Subscriber subscriber = new Subscriber("Den", "Sen", 28, Gender.MALE, "0681007722", operator);
//        subscriber.setFirstName("Den");
        //String profile = subscriber.getProfile();
//        System.out.println(profile);
//        System.out.println(subscriber.getPhoneNumber());
       // System.out.println(profile);

        Subscriber subscriber2 = new Subscriber();
        subscriber2.setFirstName("Dasha");
        subscriber2.setLastName("Sen");

        //инициализация через with
        Subscriber subscriber3 = new Subscriber()
                .withFirstName("Den")
                .withLastName("Sen");


        System.out.println("***********");
        System.out.println(subscriber.toString());
        System.out.println();


        System.out.println("******************* сравнение операторов ********");
        Operator operatorLife = new Operator("Life", "Kyiv");
        Operator operatorLife2 = new Operator("Life", "Kyiv");
        System.out.println(operatorLife2 == operatorLife); // false потому что ссылки разные
        System.out.println(operatorLife2.equals(operatorLife));

        System.out.println("***** сравнение subscribers ********");
        System.out.println(subscriber.equals(subscriber3));
    }
}
