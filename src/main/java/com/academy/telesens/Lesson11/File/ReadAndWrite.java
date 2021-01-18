package com.academy.telesens.Lesson11.File;

import java.io.*;

public class ReadAndWrite {

    public static void main(String[] args) {
        String path1 = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские имена.txt";
        String pathNewFile = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские имена_copy.txt";

        System.out.println("--------- 1й способ -----------");
        try {
            BufferedReader br = new BufferedReader(new FileReader(path1));
            PrintWriter pw = new PrintWriter(new FileWriter(pathNewFile));

            String line1;
            while ((line1 = br.readLine()) != null) {
                pw.println(line1);

            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--------- 2й способ -----------");
        try (  BufferedReader br = new BufferedReader(new FileReader(path1));
               PrintWriter pw = new PrintWriter(new FileWriter(pathNewFile))) {

            String line2;
            while ((line2 = br.readLine()) != null) {
                pw.println(line2);
            }
 //           pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
