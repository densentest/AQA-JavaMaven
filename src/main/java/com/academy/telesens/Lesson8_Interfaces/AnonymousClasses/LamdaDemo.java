package com.academy.telesens.Lesson8_Interfaces.AnonymousClasses;

public class LamdaDemo {
    public static void main(String[] args) {
        IntInterface oper1 = (i1, i2) -> i1 + i2;
        System.out.println(oper1.calc(3, 5));

        IntInterface oper2 = (i1, i2) -> i1 * i2;
        System.out.println(oper2.calc(3, 5));

        System.out.println("***** String interface");

        StringInterface strOper = s -> s.toUpperCase();
        System.out.println(strOper.oper("smth")); //SMTH

        StringInterface strOper2 = String::toUpperCase;
        System.out.println(strOper2.oper("SkmaseKSASFks")); //SKMASEKSASFKS


        System.out.println("****** ******");
        StringConsumer stringConsumer = s -> System.out.println(s);
        StringConsumer stringConsumer1 = System.out::println;

        stringConsumer.consume("Hello World");
        stringConsumer1.consume("Hello world");
    }
}
