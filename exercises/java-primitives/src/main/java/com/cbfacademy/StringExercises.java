package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        
            String outputString = new String(characters);
            //System.out.println(outputString);
            return(outputString);
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        //throw new RuntimeException("Not implemented");
        long count = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == character)
                count++;
        }
        return count;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
       // throw new RuntimeException("Not implemented");
       for (int i = 0, j = word.length() -1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
       }
       return true;
    }

    public String getName() {
        return "String Exercises";
    }
}
