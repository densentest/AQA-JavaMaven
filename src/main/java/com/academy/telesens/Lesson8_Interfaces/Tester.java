package com.academy.telesens.Lesson8_Interfaces;

import com.academy.telesens.Lesson5_OOP.OOP.Person;

public class Tester extends Person implements Coder {

    @Override
    public void coding(){
        System.out.println("Making autotest");
    }

}
