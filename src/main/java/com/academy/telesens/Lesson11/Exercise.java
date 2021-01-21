package com.academy.telesens.Lesson11;

import com.academy.telesens.Lesson10_GenericAndColections.Generic.HomeTask.ListFirst;
import com.academy.telesens.Lesson5_OOP.OOP.Person;
import com.academy.telesens.Lesson7_Polimorfizm.Gender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise extends Person {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person("Den", "ASmirn", 23, Gender.MALE);
        Person p2 = new Person("Y", "Sen", 23, Gender.MALE);
        Person p3 = new Person("A", "Sen", 23, Gender.MALE);
        Person p4 = new Person("Z", "Sen", 23, Gender.MALE);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

//        persons.sort(Comparator.comparing(Person::getFirstName));
        persons.sort((o1, o2) -> {
            if (o1.getLastName().equals(o2.getLastName())) {
                // Фамилии одинаковые => сравниваем имена
                return o1.getFirstName().compareTo(o2.getFirstName());
            } else {

                // Фамилии разные
                return o1.getLastName().compareTo(o2.getLastName());
            }

        });
        System.out.println(persons);

    }
}
