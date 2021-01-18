package com.academy.telesens.Lesson7_Polimorfizm;

import com.academy.telesens.lesson6_abstraction.*;

public class LessonTaskSavingDifferentTypesToArray {
    public static void main(String[] args) {


        Label label = new Label("label");
        ButtonForComponent button = new ButtonForComponent("login");
        CheckBox checkBox = new CheckBox("checbox");
        RoundButton roundButton = new RoundButton("round button");

        Component[] array = {label, button, checkBox, roundButton};

        for (int i = 0; i < array.length; i++) {
            array[i].draw();

        }

    }
}