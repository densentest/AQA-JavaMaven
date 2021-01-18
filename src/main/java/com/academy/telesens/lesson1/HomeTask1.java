package com.academy.telesens.lesson1;

public class HomeTask1 {
    public static void main(String[] args) {
        String name1 = "Алексей";
        String surname1 = "Петров";
        String fatherName1 = "Федорович";
        Integer age1 = 25;
        String sex1 = "М";
        String phoneNumber1 = "0931234567"; // Почему-то не понял какой тип переменной лучше использовать
                                            // в long и double не влазит

        System.out.println(String.format(" -------- Абонент 1 --------\n Имя:%s\n Фамилия:%s\n Отчество:%s\n Возраст:%s\n Пол:%s\n Номер:%s\n", name1, surname1, fatherName1,
        age1, sex1, phoneNumber1));



        String name2 = "Николай";
        String surname2 = "Иванов";
        String fatherName2 = "Львович";
        Integer age2 = 37;
        String sex2 = "М";
        String phoneNumber2 = "0977654321";

        System.out.println(String.format(" -------- Абонент 2 --------\n Имя:%s\n Фамилия:%s\n Отчество:%s\n Возраст:%s\n Пол:%s\n Номер:%s\n", name2, surname2, fatherName2,
                age2, sex2, phoneNumber2));





        String name3 = "Ирина";
        String surname3 = "Тимофеева";
        String fatherName3 = "Леонидовна";
        Integer age3 = 27;
        String sex3 = "Ж";
        String phoneNumber3 = "0669876543";

        System.out.println(String.format(" -------- Абонент 3 --------\n Имя:%s\n Фамилия:%s\n Отчество:%s\n Возраст:%s\n Пол:%s\n Номер:%s\n", name3, surname3, fatherName3,
                age3, sex3, phoneNumber3));

    }
}
