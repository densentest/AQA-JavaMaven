package com.academy.telesens.Lesson3_4;

import java.util.Arrays;

public class StringsDemo {
    public static void main(String[] args) {

        String hello = "Hello World!!!";
        System.out.println(hello.length());
        System.out.println(hello.charAt(2)); //третий символ

        String world = hello.substring(6); // подстрака начиная с символа 7
        System.out.println(world);

        String onlyWorld = hello.substring(6,11);
        System.out.println(onlyWorld);


        //////////////////////////////////////////////////

        System.out.println("******* Пример 2 *********");
        String item = "id23_12349_vtr_234";
        int firstIndex = item.indexOf("_");
        int lastIndex = item.indexOf("_", 5);
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        String numberPart = item.substring(firstIndex+1, lastIndex);
        System.out.println(numberPart);

        int index = "somestring".indexOf("okk"); //вернет -1
        System.out.println(index);

        System.out.println("********** СРАВНЕНИЕ СТРОК ***********");
        String str1 = new String ("hello");
        String str2 = "he" + "llo";
        String str3 = "hello world";

        System.out.println(str1.equals(str2));// equals лучше == потому что он не обращает внимание на способ создания переменной
        System.out.println(str1.equals(str3));


        System.out.println("******** Сравнение чисел ********");
        // для любых ссылочных типов вида Integer, String(а не int, string)
        // испозуем .equal а не в тупую ==


        Integer m1 = 200;
        Integer m2 = 200;

        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));


        System.out.println("********** ЗАМЕНА  ПОДСТРОКИ ***********");
        String msg = "Hello, Helen!!!";
        String changed = msg.replaceAll("Helen!!!", "Den!");
        System.out.println(msg);
        System.out.println(changed);


        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());

        System.out.println("********** УБИРАЕМ ЛИШНИЕ ПРОБЕЛЫ ***********");
        String msgSpaces = "   Hello Den      ";
        System.out.println("'" + msgSpaces + "'");
        System.out.println(msgSpaces.trim());

        System.out.println("********** ЗАБИРАЕМ ЭЛЕМЕНТЫ МЕЖДУ РАЗДЕЛИТЕЛЯМИ ***********");
        String demoString = "One, Two, Three";
        String[] partsOfDemoString = demoString.split(",");
        String tmp = Arrays.toString(partsOfDemoString);
        System.out.println(tmp);
        String joined = tmp
                .replaceAll("\\[", "")
                .replaceAll("\\]", "");
        System.out.println(joined);




    }
}
