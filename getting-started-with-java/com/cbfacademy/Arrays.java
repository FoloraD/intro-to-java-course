package com.cbfacademy;

public class Arrays {
    public static void main(String... args) {
        //TODO create an array of 8 Integer elements,
        int[] numbers = {94, 23, 47, 52, 6, 17, 34, 78};
        
        //TODO create an array of 12 Float elements
        float[] something = {25.54f, 6.58f, 9.876f, 403.987f, 58.6f, 1.2f, 65.24f, 86.09f, 39.96f, 4.03f, 18.6f, 198.2f};

        //TODO create an array of 5 Double elements
        double[] decimals = {45.78, 3.45, 9.21, 805.1405, 78.6};

        //TODO create an array of 6 Boolean elements
        boolean[] answers = {true, false, true, true, false, false};
        
        //TODO print their 5th element to screen
        System.out.println(numbers[4]); //output 6
        System.out.println(something[4]); //output 58.6
        System.out.println(decimals[4]); //output 78.6
        System.out.println(answers[4]); //output false

; 
    };
}