package com.academy.telesens.Lesson10_GenericAndColections.Generic;

import com.academy.telesens.Lesson5_OOP.OOP.Person;

public class DemoForPair {

    public static void main(String[] args) {
        Pair<Integer, String > pair = new Pair<>(10, "string");
        int n = (int)pair.getFirst();

        String str = (String)pair.getSecond();
        System.out.println("Pair 1:" + n + "->" + str);

        Pair<String, Integer> pair2 = new Pair("String", 5);
        Object value2 = pair2.getFirst();
        if (value2 instanceof Integer){
        //    int n2 = (int)pair2.getFirst();
        }


        Pair pair3 = new Pair(5, 10);

        Person person = new Person();
        Pair pair4 = new Pair(5, person);

        double result1 = sum(1, 3);
        double result2 = sum(1.2,3);
        //  sum(1, "Hello");
        System.out.println(result1);
        System.out.println(result2);

    }

    public static<U, V> void Print(U arg1, V arg2){
        System.out.println("first: " + arg1 + ", second: " + arg2);
    }

    public static <U extends Number, V extends  Number> double sum (U arg1, V arg2){
        return arg1.doubleValue()+arg2.doubleValue();

    }

    public static void someMethod(Pair<? extends  Number,?> pair){
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        System.out.println(first + " " + second);
    }

}
