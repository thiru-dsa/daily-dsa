package com.dsa;

public class FindExistenceOfSubstring {

    public static void main(String[] args) {

        String string1 = "test123string";
        String string2 = "123";

        System.out.println(findIndexOfExistenceSubstring(string1, string2));
    }

    private static int findIndexOfExistenceSubstring(String inputString1, String inputString2) {
        int indexOfSubString = -1;
        int iterator = 0;
        int jterator = 0;

        while(iterator < inputString1.length() && jterator < inputString2.length()) {
            if(inputString1.charAt(iterator) == inputString2.charAt(jterator)) {
                jterator++;
                indexOfSubString = (iterator + 1) - jterator;
            } else {
                indexOfSubString = -1;
            }
            iterator++;
        }

        return indexOfSubString;
    }
}
