package com.academy.telesens.Lesson11.File;

import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) {

        String pathIn = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\write-demo.txt";
       try (PrintWriter pw = new PrintWriter (new FileWriter(pathIn))) {
           pw.write("Test string");
       } catch (IOException e) {
           System.out.println(e);
       }

    }
}
