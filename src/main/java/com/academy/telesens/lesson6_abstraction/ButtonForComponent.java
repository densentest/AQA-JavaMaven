package com.academy.telesens.lesson6_abstraction;

public class ButtonForComponent extends Component {
    public ButtonForComponent(String login) {

    }

    @Override
    public void draw() {
        System.out.println("Button: draw");
    }

    public void click() {
        System.out.println("Button: click");

    }
}
