package com.academy.telesens.Lesson2;

public class VarDemo {
    public static void main(String[] args) {
        int number;
        number = 1;
        System.out.println(number);

        number = Integer.parseInt("123");
        number = Integer.parseInt("123");
        System.out.println(number);

//        int maxValue = Integer.MAX_VALUE;
//        int maxValue2= maxValue + 1;
//
        int maxValue = Integer.MAX_VALUE;
        long maxValue2= maxValue + 1L;
        System.out.println(maxValue);
        System.out.println(maxValue2);

        double d = 1234.345;
        System.out.println(d);


        //char

        char symbol = 'a'; // обязательно одинарная кавычка. Если двойная = эт строка. Строка != char
        System.out.println(symbol);
        symbol = 'a'+1;
        System.out.println(symbol);
        char symbol2 = 72;
        System.out.println(symbol2);


        long bigValue = 213243422422L; //без L  он думает, что это тип int
        System.out.println(bigValue);


        boolean logic = true;
        System.out.println(logic);

        int phoneNumber= 9379992;
        System.out.println(phoneNumber);

//        int phoneNumber= 09379992; //если наинается с нуля то это шестнадцатиричная система


//      Пиведение типов
        int intValue = 123;
        long longValue = intValue; // приведение типа из int в long
        System.out.println(longValue);


        long longValue2 = 1234;
        int intValue2 = (int) longValue2;// приведение типа из long в int
        System.out.println(longValue2);




    }
}
