package com.academy.telesens.Lesson5_OOP.Hometasks;

import com.academy.telesens.Lesson9_Exceptions.HomeTask.IllegalDateException;

import java.util.Objects;

public class CustomDate {

    private int day;
    private int month;
    private int year;


    public CustomDate(int day, int month, int year) {


        if (day > 31 || day < 1) {
            throw new IllegalDateException("День не может быть больше 31 или меньше 1");
        }

        if (day == 31 && monthDoesntHave31Day(month)) {
            throw new IllegalDateException("В этом месяце не может быть 31 день");
        }

        if (month > 12 || month < 1) {
            throw new IllegalDateException("Месяц не может быть больше 12 или меньше 1");
        }
        if (year < 1) {
            throw new IllegalDateException("Год не может быть отрицательным");
        }
        if (month == 2 && day > 29 && isLeapYear(year)) {
            throw new IllegalDateException("Это высокосный год, в феврале не может быть больше 29 дней");
        }
        if (month == 2 && day > 28 && !isLeapYear(year)) {
            throw new IllegalDateException("Это не высокосный год, в феврале не может быть больше 28 дней");
        } 

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public CustomDate() {

    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getFormattedDate() {
        return String.format("%02d.%02d.%d", day, month, year);

    }

    protected static boolean isLeapYear(int year) {
        if ((year % 400) == 0) {
            return true;
        }

        if ((year % 4 == 0 && year % 100 != 0)){
            return true;
        }

            return false;
    }


    protected static boolean monthDoesntHave31Day(int month) {
        if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
            return true;
        }
        return false;
    }

    public boolean validateDate(int day, int month, int year) {


        if (day > 31 || day < 1) {
            return false;
        }

        if (day == 31 && monthDoesntHave31Day(month)) {
            return false;
        }

        if (month > 12 || month < 1) {
            return false;
        }
        if (year < 1) {
            return false;
        }
        if (month == 2 && day > 29 && isLeapYear(year)) {
            return false;
        }
        if (month == 2 && day > 28 && !isLeapYear(year)) {
            return false;
        } else return true;
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDate date = (CustomDate) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}

