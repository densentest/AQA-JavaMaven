package com.academy.telesens.Lesson10_GenericAndColections.Generic.Sort;

import com.academy.telesens.Lesson5_OOP.OOP.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare (Person p1, Person p2){
        if (p1.getAge() < p2.getAge())
            return -1;
        if (p1.getAge() > p2.getAge())
            return 1;
        return 0;
    }
}
