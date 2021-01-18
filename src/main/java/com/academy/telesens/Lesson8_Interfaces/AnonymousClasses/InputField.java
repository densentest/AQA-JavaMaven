package com.academy.telesens.Lesson8_Interfaces.AnonymousClasses;

import com.academy.telesens.Lesson8_Interfaces.VisualComponent;

public class InputField implements VisualComponent {

    @Override
    public void draw(){
        System.out.println("Input field: draw");
    }
}
