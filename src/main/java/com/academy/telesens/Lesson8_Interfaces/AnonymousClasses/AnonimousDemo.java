package com.academy.telesens.Lesson8_Interfaces.AnonymousClasses;

import com.academy.telesens.Lesson8_Interfaces.Coder;
import com.academy.telesens.Lesson8_Interfaces.Fighter;
import com.academy.telesens.Lesson8_Interfaces.VisualComponent;
import com.academy.telesens.lesson6_abstraction.ButtonForComponent;

public class AnonimousDemo {
    public static void main(String[] args) {
        VisualComponent component = new ButtonForComponent("Login");
        VisualComponent component2 = new InputField();
        component.draw();
        component2.draw();

        //анонимный класс. Реализация интерфейса с одним методом
        VisualComponent customComponent = new VisualComponent() {
            @Override
            public void draw() {
                System.out.println("Draw: custom component");
            }
        };

        customComponent.draw();

        Coder customCoder = new Coder() {
            @Override
            public void coding() {
                System.out.println("Custom coding method");
            }
        };
        customCoder.coding();

        Fighter fighter = new Fighter() {
            @Override
            public void fight() {
                System.out.println("Sumo");
            }
        };
        fighter.fight();

        //лямбда выражения. Более короткий стиль реалзации анонимного класса
        fighter = ()-> System.out.println("Kick boxer");
        fighter.fight();
    }
}
