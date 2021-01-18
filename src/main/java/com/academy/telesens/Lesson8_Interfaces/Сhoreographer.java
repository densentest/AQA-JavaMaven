package com.academy.telesens.Lesson8_Interfaces;

import com.academy.telesens.Lesson5_OOP.OOP.Person;

public class Сhoreographer extends Person implements Dancer {

    @Override
    public void dancing() {
        System.out.println("Dancing");

    }
}
