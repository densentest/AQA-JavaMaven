package com.academy.telesens.Lesson3_4;

//вывести те элементы массива, у которых id в промежутке от 10 до 15(включая)

public class Lessontask3takingelements {
    public static void main(String[] args) {
        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};

        //перебираем все треки
        //извлекаем для каждого номер и выводим наконсоль
        System.out.println("************* мой способ *************");
        for (int i=0; i < tracks.length; i++){
            int n = tracks[i].indexOf("_");
            String part = tracks[i].substring(n+1);
            int partToString = Integer.parseInt(part);//приводим id из строки в число
                    if (  partToString <= 15 && partToString >=10){
                        System.out.println(tracks[i] + " ");
                    }
        }
    }
}
