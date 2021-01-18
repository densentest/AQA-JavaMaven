package com.academy.telesens.Lesson5_OOP;

public class CheckingHomeTasksFromLesson4 {
    public static void main(String[] args) {
        String palindrome = "qwertyytrewq";
        String notPalidrome = "hello world";

        System.out.println(isPoledrome(palindrome));
        System.out.println(isPoledrome(notPalidrome));

        System.out.println(countSubstrings("java is the best javascript", "java"));

    }

    public static boolean isPoledrome (String teststring){

        for (int i=0, k = teststring.length()-1;    i < k;     i++, k--){
            if (teststring.charAt(i) != teststring.charAt(k)){
                System.out.println("Not palidrome");
                return false;// найдено несоответсвие
            }

        }
        return true; //цикл закончился, значит символы равны
    }

    public static int countSubstrings(String origin, String subs){
        int count = 0;
        int index = 0;

        while ( (index = origin.indexOf(subs, index)) != -1){
            count++;
            index = index + subs.length();

        }

        return count;
    }
}
