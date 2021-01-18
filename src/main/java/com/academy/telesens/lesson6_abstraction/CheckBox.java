package com.academy.telesens.lesson6_abstraction;

public class CheckBox extends ButtonForComponent{
    protected boolean checked;

    public CheckBox(String login) {
        super(login);
    }

    @Override
    public void draw() {
        System.out.println("Checkbox: draw");
    }

    @Override
    public void click() {
        System.out.println("Checkbox: click");
        checked = true;

    }

    public boolean isChecked(){

        return checked;
    }
}
