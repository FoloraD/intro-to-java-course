package com.cbfacademy;

//This program creates 3 instances of the Person class & prints their details.

public class HelloWorld {

    public static void main(String... args) {
        Person angelaBassett = new Person("Angela", "Basset", 64);
        Person whoppiGoldberg = new Person("Whoopi", "Goldberg", 67);
        Person lorettaDevine = new Person("Loretta", "Devine", 73);

        String angelaBassettDetails = angelaBassett.getDetails();
        String whoppiGoldbergDetails = whoppiGoldberg.getDetails();
        String lorettaDevineDetails = lorettaDevine.getDetails();


        System.out.println(angelaBassettDetails);
        System.out.println(whoppiGoldbergDetails);
        System.out.println(lorettaDevineDetails);
    }
}