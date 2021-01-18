package com.academy.telesens.Lesson5_OOP.OOP;

public class Demo {
    public static void main(String[] args) {
        Button btn = new Button();// создаем екземпляр класса Button, которые создали ранее
        Integer number = 123;
        String str = "dsfs";

        btn.setSize(1234);
        btn.text = "Submit";

        System.out.println("btn.size" + btn.getSize());

        System.out.println("***************************");
        btn.printInfo();

        btn.setText("new text");
        btn.printInfo();

        Button btn4 = new Button();
        btn4.init();
        btn4.printInfo();

        Button btn5 = new Button();
        btn5.init(45, "Logout");
        btn5.printInfo();

        btn5.setSize(-12);


        Button btn6 = new Button();
        System.out.println(btn6);

        Button btn7 = new Button(5, "fsfdsf");
        System.out.println(btn7);

        System.out.println(Button.DEFAULT_TEXT);
    }
}
