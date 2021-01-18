package com.academy.telesens.lesson6_abstraction;

import com.academy.telesens.Lesson8_Interfaces.VisualComponent;

public abstract class Component implements VisualComponent {
    protected int xPosition;
    protected int yPosition;
    protected int width;
    protected int height;
    protected String text;

    @Override
    abstract public void draw();
}
