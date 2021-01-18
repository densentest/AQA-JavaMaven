package com.academy.telesens.Lesson5_OOP;

import java.util.Arrays;

public class Lessontask1 {
    public static void main(String[] args) {

        String listofPrices = "18 999 ₴, 29 999 ₴, 19 499 ₴, 26 555 ₴, 22 999 ₴, 27 777 ₴, 36 399 ₴, 23 349 ₴, 57 777 ₴";
        String[] arrayofPrices = listofPrices.split(",");

        String finalString="";

        for (int i=0; i < arrayofPrices.length; i++ ){
             finalString = finalString + arrayofPrices[i].replaceAll("\\ ₴", ",").
                     replaceAll(" ","");

        }
       // System.out.println(finalString);

        String[] finalString1 = finalString.split(",");

        Integer[] arrayofPricesInt = new Integer[finalString1.length];
        for (int k=0; k<finalString1.length; k++){
            arrayofPricesInt[k] = Integer.parseInt(finalString1[k]);
            System.out.print(finalString1[k] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arrayofPricesInt));
        Arrays.sort(arrayofPricesInt);
        System.out.println(Arrays.toString(arrayofPricesInt));
    }


}
