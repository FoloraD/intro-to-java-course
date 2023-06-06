package com.cbfacademy;

import java.util.List;

public class Conditionals {
    public static void main(String... args) {
        List<Integer> numbers = List.of(1, 2, 4);

        if(numbers.contain(5)) {
            System.out.println("Your list has the number 5 in it");
        }
        else {
            System.out.println(" your list does not have the number 5 in it");
        }

    }

    
}
