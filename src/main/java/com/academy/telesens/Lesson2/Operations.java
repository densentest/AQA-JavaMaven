package com.academy.telesens.Lesson2;

public class Operations {
    public static void main(String[] args) {
        int n=2;
        System.out.println((n < 3) && (n > 1)); // true. && = AND
        System.out.println((n>2) && (n<3));// false
        System.out.println((n>2) || (n<3)); // true хотя бы одно из условий выполняется. || = OR
        System.out.println((n>2) || (n==0));//false

        System.out.println(!true);// false


        final int k= 10;// нелзья присвоить новое значение переменной
        char s = k; // но ее все еще можно превести к другому типу



    }
}
