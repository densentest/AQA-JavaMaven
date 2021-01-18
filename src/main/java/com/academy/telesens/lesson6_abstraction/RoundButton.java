package com.academy.telesens.lesson6_abstraction;

public class RoundButton extends ButtonForComponent {
    public RoundButton(String login) {
        super(login);
    }

    @Override
    public void draw() {
        System.out.println("Round button: draw");

    }
}
