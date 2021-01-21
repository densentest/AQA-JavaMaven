package com.academy.telesens.Lesson11.HomeTask;

import java.io.*;
import java.util.*;

public class DemoForHomeTask {
    public static void main(String[] args) {

        String maleNames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские имена.txt";
        String maleSurnames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские фамилии.txt";

        String femaleNames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\женские имена.txt";
        String femaleSurnames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\женские фамилии.txt";

        String subscribers = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\subscribers.txt";


        List<String> maleNamesList = new ArrayList<>();
        List<String> maleSurnameList = new ArrayList<>();
        List<String> femaleNamesList = new ArrayList<>();
        List<String> femaleSurnameList = new ArrayList<>();
        List<String> persons = new ArrayList<>();
        List<String> gender = new ArrayList<>();
        List<String> phoneNumbers = new ArrayList<>();
        List<String> operator = new ArrayList<>();
        List<String> fullPhoneNumber = new ArrayList<>();
        Random random = new Random();

        gender.add("Male");
        gender.add("Female");
        operator.add("Vodafone");
        operator.add("Kyivstar");
        operator.add("Life");
        phoneNumbers.add("38097*******");
        phoneNumbers.add("38067*******");
        phoneNumbers.add("38098*******");
        phoneNumbers.add("38063*******");
        phoneNumbers.add("38093*******");
        phoneNumbers.add("38073*******");
        phoneNumbers.add("38050*******");
        phoneNumbers.add("38066*******");
        phoneNumbers.add("38095*******");

        //записываем мужские имена+фамилии в коллекции maleNames и maleSurnames
        try {
            BufferedReader readMaleName = new BufferedReader(new FileReader(maleNames));
            BufferedReader readMaleSurname = new BufferedReader(new FileReader(maleSurnames));
            String line;
            String line1;
            while ((line = readMaleName.readLine()) != null) {
                maleNamesList.add(line);
            }
            while ((line1 = readMaleSurname.readLine()) != null) {
                maleSurnameList.add(line1);
            }
            readMaleName.close();
            readMaleSurname.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //записываем женские имена+фамилии в коллекции femaleNames и femaleSurnames
        try {
            BufferedReader readFemaleName = new BufferedReader(new FileReader(femaleNames));
            BufferedReader readFemaleSurname = new BufferedReader(new FileReader(femaleSurnames));
            String line2;
            String line3;
            while ((line2 = readFemaleName.readLine()) != null) {
                femaleNamesList.add(line2);
            }
            while ((line3 = readFemaleSurname.readLine()) != null) {
                femaleSurnameList.add(line3);
            }
            readFemaleName.close();
            readFemaleSurname.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //заполняем коллекцию fullPhoneNumber номерами в виде 38067******* Kyivstar
        for (int t = 0; t < phoneNumbers.size(); t++) {
            if ((phoneNumbers.get(t) == "38097*******") || (phoneNumbers.get(t) == "38067*******") || (phoneNumbers.get(t) == "38098*******")) {
                fullPhoneNumber.add(phoneNumbers.get(t) + ", " + operator.get(1));
            } else if ((phoneNumbers.get(t) == "38063*******") || (phoneNumbers.get(t) == "38093*******") || (phoneNumbers.get(t) == "38073*******")) {
                fullPhoneNumber.add(phoneNumbers.get(t) + ", " + operator.get(2));
            } else if ((phoneNumbers.get(t) == "38095*******") || (phoneNumbers.get(t) == "38066*******") || (phoneNumbers.get(t) == "38050*******")) {
                fullPhoneNumber.add(phoneNumbers.get(t) + ", " + operator.get(0));
            }
        }

        //заполняем коллекцию persons ФИО+пол (мужские)
        for (int m = 0; m < maleNamesList.size(); m++) {
            persons.add(maleNamesList.get(random.nextInt(maleNamesList.size())) + " " + maleSurnameList.get(random.nextInt(maleSurnameList.size())) + ", " + gender.get(0));
        }
        //заполняем коллекцию persons ФИО+пол (женские)
        for (int f = 0; f < femaleNamesList.size(); f++) {
            persons.add(femaleNamesList.get(random.nextInt(femaleNamesList.size())) + " " + femaleSurnameList.get(random.nextInt(femaleSurnameList.size())) + ", " + gender.get(1));
        }

        //заполняем коллекци финальными данными
        try {
            BufferedReader brMaleNames = new BufferedReader(new FileReader(maleNames));
            BufferedReader brMaleSurnames = new BufferedReader(new FileReader(maleSurnames));
            PrintWriter printWriter = new PrintWriter(new FileWriter(subscribers));

            for (int i = 1; i < 201; i++) {
                printWriter.println((i + ", "
                        + persons.get(random.nextInt(persons.size())) + ", "
                        + RandomAge() + ", "
                        + fullPhoneNumber.get(random.nextInt(fullPhoneNumber.size()))));
            }

            brMaleNames.close();
            brMaleSurnames.close();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int RandomAge() {
        Random random1 = new Random();
        int randomInt = random1.nextInt(85) + 5;

        return randomInt;
    }
}
