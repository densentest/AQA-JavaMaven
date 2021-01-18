package com.academy.telesens.Lesson2;

import java.util.Scanner;

public class HomeTask03 {
    public static void main(String[] args) {
        int q,w;

        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        q = scanner.nextInt();

        System.out.println("Введите второе число:");
        w = scanner.nextInt();

        System.out.println(String.format("Вы ввели:\n q = %d\n w = %d", q, w));
        System.out.println("q разделить на w(q/w) = " + q/w);
        System.out.println("Остаток от деления q на w(q%w) = " + q%w);
    }
}
