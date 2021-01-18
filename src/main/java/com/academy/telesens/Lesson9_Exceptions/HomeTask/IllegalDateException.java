package com.academy.telesens.Lesson9_Exceptions.HomeTask;


public class IllegalDateException extends RuntimeException {

    private String message;

    public IllegalDateException() {
    }

    public IllegalDateException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
