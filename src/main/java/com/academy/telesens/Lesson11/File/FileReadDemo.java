package com.academy.telesens.Lesson11.File;

import java.io.*;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        String path = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские имена.txt";

// 1 способ
        System.out.println("----------- 1 способ ------------");
        try (InputStream is = new FileInputStream(path)) {

            Scanner scanner = new Scanner(is);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

// 2 способ
        System.out.println("----------- 2 способ ------------");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
