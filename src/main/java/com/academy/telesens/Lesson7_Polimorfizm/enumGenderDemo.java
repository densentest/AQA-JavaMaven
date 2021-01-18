package com.academy.telesens.Lesson7_Polimorfizm;

import java.util.Arrays;

public class enumGenderDemo {
    public static void main(String[] args) {
        Gender gender = Gender.MALE;

        switch (gender){
            case MALE:
                System.out.println("Мужчина");
                break;

            case FEMALE:
                System.out.println("Женщина");
                break;
        }

        System.out.println("Порядковый номер enum");
        System.out.println(Gender.MALE.ordinal());

        System.out.println("массив enum значений");
        Gender[] genders = Gender.values();
        System.out.println(Arrays.toString(genders));

        System.out.println("енам из строки");
        Gender gender2 = Gender.valueOf("FEMALE");
        System.out.println(gender2);

    }
}
