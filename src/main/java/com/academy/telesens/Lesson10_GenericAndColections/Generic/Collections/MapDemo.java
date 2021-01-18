package com.academy.telesens.Lesson10_GenericAndColections.Generic.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(10, "ten");
        map.put(12, "smth");
        System.out.println(map);

        map.put(1, "asdasdasd");
        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.size());
    }
}
