package com.dsa;

public class PrintGivenStringInXPattern {

    public static void main(String[] args) {

        String testCase1 = "98765";
        String testCase2 = "abcdefg";
        String testCase3 = "xyz";

        printPattern(testCase1);
        printPattern(testCase2);
        printPattern(testCase3);
    }

    public static void printPattern(String inputString) {

        int stringLength = inputString.length();
        for(int currentIndex = 0; currentIndex < stringLength; currentIndex++) {

            if(currentIndex < stringLength / 2) {
                System.out.println(
                        " ".repeat(currentIndex) +
                        inputString.charAt(currentIndex) +
                        " ".repeat(stringLength - (currentIndex * 2)) +
                        inputString.charAt(stringLength - currentIndex - 1) +
                        " ".repeat(currentIndex)
                );
            }
            if(currentIndex == stringLength / 2) {
                System.out.println(
                        " ".repeat((stringLength / 2) + 1) +
                        inputString.charAt(currentIndex)
                );
            }
            if(currentIndex > stringLength / 2) {
                System.out.println(
                       " ".repeat(stringLength - currentIndex - 1) +
                       inputString.charAt(stringLength - currentIndex - 1) +
                       " ".repeat( ((currentIndex + 1) * 2) - stringLength) +
                       inputString.charAt(currentIndex)
                );
            }
        }
        System.out.println();
    }
}
