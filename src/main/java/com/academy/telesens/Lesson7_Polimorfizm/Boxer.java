package com.academy.telesens.Lesson7_Polimorfizm;

import com.academy.telesens.Lesson5_OOP.OOP.Person;
import com.academy.telesens.Lesson8_Interfaces.Fighter;

public class Boxer extends Person implements Fighter {
    @Override
    public String getProfile() {
        return "Boxer";
    }

    @Override
    public void fight() {
        System.out.println("Fighting");
    }
}
