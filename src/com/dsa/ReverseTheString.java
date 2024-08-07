package com.dsa;

public class ReverseTheString {
    public static void main(String[] args) {

        String testcase1 = "one              two                 three";
        String testcase2 = "I               love           India";

        System.out.println(reverseTheString(testcase1));
        System.out.println(reverseTheString(testcase2));
    }

    private static String reverseTheString(String inputString) {

        inputString = inputString.trim();
        int indexOfSpace = inputString.indexOf(" ");

        if(indexOfSpace == -1) {
            return inputString;
        }

        String firstWord = inputString.substring(0, indexOfSpace);
        String restOfTheWord = inputString.substring(indexOfSpace);

        return reverseTheString(restOfTheWord)  + " " + firstWord;
    }
}