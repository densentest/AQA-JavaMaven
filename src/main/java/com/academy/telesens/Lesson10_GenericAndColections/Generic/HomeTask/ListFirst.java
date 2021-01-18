package com.academy.telesens.Lesson10_GenericAndColections.Generic.HomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFirst {
    public static void main(String[] args) {
        String[] array = new String[]{"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "Max" };
        List<String> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println(list);

        list.add("Philip");
        list.add("Joseph");
        list.add("Leon");
        System.out.println(list);
        list.remove("Leonid");
        list.remove("Veronika");
        System.out.println(list);

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == "Helen") {
                list.remove(list.get(j));
                list.add(j, "Elizabet");
                break;
            }
        }
        System.out.println(list);
        list.sort(String::compareTo);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) == "Andry") {
                System.out.println("Элемент Andry встречается в списке");
            }
        }
        System.out.println(list.contains("Andry"));

//        for (int l = 0; l < list.size(); l++) {
//            if ( list.get(l) != "Kate"){
//                list.remove(l);
//            }
//        }
//        System.out.println(list);
    }

}

