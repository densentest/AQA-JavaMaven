package com.academy.telesens.Lesson10_GenericAndColections.Generic.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(14);
        set.add(14);
        set.add(14);

//исключение дубликатов

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(1);
        System.out.println(integerList);

        Set<Integer> integerSet = new HashSet<>(integerList);
        System.out.println(integerSet);



    }
}
