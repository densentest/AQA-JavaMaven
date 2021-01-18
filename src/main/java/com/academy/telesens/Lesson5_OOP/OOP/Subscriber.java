package com.academy.telesens.Lesson5_OOP.OOP;

import com.academy.telesens.Lesson7_Polimorfizm.Gender;

public class Subscriber extends Person {
    private String phoneNumber;
    private Operator operator;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Subscriber() {

    }

    public Subscriber(
            String firstName,
            String lastName,
            Integer age,
            Gender gender,
            String phoneNumber,
            Operator operator) {
        super(firstName, lastName, age, gender); // конструктор базового класса должен быть вызван первым
        // вызвали конструктор базового класа с его полями. И в текущем классе добавили свои поля
        this.phoneNumber = phoneNumber;
        this.operator = operator;
        //   setFirstName(firstName);
    }

    public String getProfile() {
//        return String.format("\nFirst name: %s\n Last name: %s\n Age: %s\n Gender: %s\n Phone number: %s\n Operator: %s",
//                firstName, lastName, age, gender, phoneNumber, operator.getName());
//    }
        return  super.getProfile() + String.format(" Phone number: %s\n Operator: %s",
                firstName, lastName, age, gender, phoneNumber, operator.getName()); //удалил operator.getName()
    }

    //методы with
    public Subscriber withFirstName (String firstName){
        super.firstName = firstName;
        return this;
    }

    public Subscriber withLastName (String lastName){
        super.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", operator=" + operator +
                '}';
    }
}
