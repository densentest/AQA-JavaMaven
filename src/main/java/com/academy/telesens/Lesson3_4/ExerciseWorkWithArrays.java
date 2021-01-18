package com.academy.telesens.Lesson3_4;

import java.util.Arrays;

public class ExerciseWorkWithArrays {
    public static void main(String[] args) {
        String[] users = {"Andry", "Abdel", "Nataly", "Alyona", "Nataly", "Alyona", "Andry", "Abdel"};

        String[] group1 = new String[4];
        String[] group2 = new String[4];

        for (int i=0; i<4; i++){
            group1[i] = users[i];
        }

        group2 = Arrays.copyOfRange(users,4,users.length);


        System.out.println(Arrays.toString(users));
        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));

        if (Arrays.equals(group1, group2)){
            System.out.println(String.format("Массив %s равен массиву %s", (Arrays.toString(group1)),
                    (Arrays.toString(group2))));
        }
        System.out.println(String.format("Массив %s не равен массиву %s", (Arrays.toString(group1)),
                (Arrays.toString(group2))));


    }
}
