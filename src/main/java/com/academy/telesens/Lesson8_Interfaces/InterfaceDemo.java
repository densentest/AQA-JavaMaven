package com.academy.telesens.Lesson8_Interfaces;

import com.academy.telesens.Lesson5_OOP.OOP.Person;
import com.academy.telesens.Lesson7_Polimorfizm.Boxer;
import com.academy.telesens.lesson6_abstraction.ButtonForComponent;
import com.academy.telesens.lesson6_abstraction.Component;
import com.academy.telesens.lesson6_abstraction.Label;

import java.util.Arrays;

public class InterfaceDemo {
    public static void main(String[] args) {
        ButtonForComponent button = new ButtonForComponent("Login");
        Component button2 = new ButtonForComponent("Login");
        VisualComponent button3 = new ButtonForComponent("Login");
        VisualComponent label = new Label("Login"); // у лейбел должен быть метод draw, который есть у visualComponent


        System.out.println("************ Упражнение **************");

        Coder programmer = new Programmer();
      //  programmer.coding();

        Dancer dancer = new Сhoreographer();
      //  dancer.dancing();

        Fighter boxer = new Boxer();
       // boxer.fight();


        Object[] persons = {programmer, dancer, boxer};

        for (int i=0; i < persons.length; i++){
            if (persons[i] instanceof Dancer){
                ((Dancer)persons[i]).dancing();
            }
        }

        System.out.println("******** Упражнение 2 *********");

        Coder tester = new Tester();
        //tester.coding();


        Coder[] guysFromIT = {programmer, tester};

        for (int j=0; j < guysFromIT.length; j++){
            (guysFromIT[j]).coding();
        }

        System.out.println(" ************** упражнение 3 **********");

        Person[] people = {new Boxer(), new Сhoreographer(), new Programmer()};
        System.out.println(Arrays.toString(people));


    }
}
