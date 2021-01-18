package com.academy.telesens.lesson6_abstraction.HomeTask;

import com.academy.telesens.Lesson5_OOP.Hometasks.CustomDate;
import com.academy.telesens.Lesson9_Exceptions.HomeTask.IllegalDateException;

import java.util.Objects;

public class CustomDateTime extends CustomDate {
    private int hour;
    private int minute;
    private int second;
    private int dateFormat;

    public CustomDateTime() {
    }

    public CustomDateTime(int day, int year, int month, int hour, int minute, int second) throws IllegalDateException {
        super(day, month, year);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomDateTime (int hour, int minute, int second) throws IllegalDateException {
        if (hour > 23 || hour < 0) {
            throw new IllegalDateException("час неверный");
        }

        if (minute > 59 || minute < 0) {
            throw new IllegalDateException("минута неверная");
        }
        if (second > 59 || second < 0) {
            throw new IllegalDateException("секунда неверная");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(int dateFormat) {
        this.dateFormat = dateFormat;
    }
    public String getFormatedTime(){
        return String.format("Вы ввели время: %02d:%02d:%02d",  hour, minute, second);
    }

    @Override
    public String getFormattedDate() {
        if (validateBothDateAndTime()) {
            return String.format("Вы ввели коректную дату: %02d.%02d.%d %02d:%02d:%02d", getDay(), getMonth(), getYear(), hour, minute, second);
        }
        return String.format("Вы ввели некоректную дату: %02d.%02d.%d %02d:%02d:%02d", getDay(), getMonth(), getYear(), hour, minute, second);
    }


    public boolean dateFormatValueIs12() {
        if (dateFormat == 24) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CustomDateTime{" +
                "day=" + getDay() +
                "month=" + getMonth() +
                "year=" + getYear() +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }


    public static boolean validateTime(int hour, int minute, int second) {
        if (hour > 23 || hour < 0) {
            return false;
        }

        if (minute > 59 || minute < 0) {
            return false;
        }
        if (second > 59 || second < 0) {
            return false;
        }

        return true;
    }


    public boolean validateBothDateAndTime() {
        if (validateTime(hour, minute, second) && validateDate(getDay(), getMonth(), getYear())) {
            return true;
        }
        return false;
    }

    public String getFormattedDateBasedOnDateFormat() {
        if (validateBothDateAndTime() && dateFormatValueIs12()) {
            if (hour > 12) {
                this.hour = hour - 12;
                return String.format("Вы ввели коректную дату: %02d.%02d.%d %d:%02d:%02d PM",
                        getDay(), getMonth(), getYear(), hour, minute, second);
            }
            if (hour < 12) {
                return String.format("Вы ввели коректную дату: %02d.%02d.%d %d:%02d:%02d AM",
                        getDay(), getMonth(), getYear(), hour, minute, second);
            }
            if (hour == 12) {
                return String.format("Вы ввели коректную дату: %02d.%02d.%d %d:%02d:%02d PM",
                        getDay(), getMonth(), getYear(), hour, minute, second);
            }

        }

        if (validateBothDateAndTime() && !dateFormatValueIs12()) {
            return String.format("Вы ввели коректную дату: %02d.%02d.%d %02d:%02d:%02d",
                    getDay(), getMonth(), getYear(), hour, minute, second);
        }

        if (!validateBothDateAndTime() && dateFormatValueIs12()) {
            if (hour > 12) {
                this.hour = hour - 12;
                return String.format("Вы ввели некоректную дату или время: %02d.%02d.%d %d:%02d:%02d PM",
                        getDay(), getMonth(), getYear(), hour, minute, second);
            }
            if (hour < 12) {
                return String.format("Вы ввели некоректную дату или время: %02d.%02d.%d %d:%02d:%02d AM",
                        getDay(), getMonth(), getYear(), hour, minute, second);
            }
            if (hour == 12) {
                return String.format("Вы ввели некоректную дату или время: %02d.%02d.%d %d:%02d:%02d PM",
                        getDay(), getMonth(), getYear(), hour, minute, second);
            }

        }

        return String.format("Вы ввели некоректную дату или время: %02d.%02d.%d %02d:%02d:%02d", getDay(), getMonth(), getYear(), hour, minute, second);


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomDateTime that = (CustomDateTime) o;
        return hour == that.hour && minute == that.minute && second == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hour, minute, second);
    }
}
