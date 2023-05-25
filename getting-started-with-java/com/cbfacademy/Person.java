package com.cbfacademy;

//Person class represents details about a person
public class Person {
    final static String SPECIES = "Human";

    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getDetails() {
        return String.format(
            "My name is %s %s, and I am %s years young. I belong to the %s species.", this.firstName, this.lastName, this.age, SPECIES
        );
    }


}