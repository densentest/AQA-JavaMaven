package com.academy.telesens.Lesson5_OOP.OOP;

public class Button {
    public static String DEFAULT_TEXT = "Some button";
    private  int size; // по умолчанию 0
    String text; // по умолчанию null




// методы
    void printInfo(){
        System.out.println(String.format("sixe %d, text: %s", size, text));
    }

    void setText(String Text){
        this.text = Text;
    }

    void init(){
        size = 20;
        text = "NoName";

    }

    void init(int size, String text){
        this.size = size;
        this.text = text;
    }

    public void setSize(int size) {

        if (size < 0){
            System.out.println("Size cannot be" + size);
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }


    //конструктор
    public Button (){
        System.out.println("Конструктор класса Button");
    }

    public Button(int size, String text) {
        System.out.println("Конструктор с парамметрами");
        this.size = size;
        this.text = text;
    }
}

