package com.dsa;

public class StringExpander {
    public static void main(String[] args) {

        String testCase1 = "a1b10";
        String testCase2 = "b3c6d15";
        String testCase3 = "x2y3z4";
        String testCase4 = "a5";
        String testCase5 = "m1n0p2";
        String testCase6 = "";

        StringExpander expander = new StringExpander();

        System.out.println("Expanded String of \"" + testCase1 + "\" is " + "\"" + expander.expandString(testCase1) + "\"");
        System.out.println("Expanded String of \"" + testCase2 + "\" is " + "\"" + expander.expandString(testCase2) + "\"");
        System.out.println("Expanded String of \"" + testCase3 + "\" is " + "\"" + expander.expandString(testCase3) + "\"");
        System.out.println("Expanded String of \"" + testCase4 + "\" is " + "\"" + expander.expandString(testCase4) + "\"");
        System.out.println("Expanded String of \"" + testCase5 + "\" is " + "\"" + expander.expandString(testCase5) + "\"");
        System.out.println("Expanded String of \"" + testCase6 + "\" is " + "\"" + expander.expandString(testCase6) + "\"");

    }

    public String expandString(String inputString) {

        char currentCharacter = '\0';
        int numberOfTimesCharacterOccurs = 0;
        StringBuilder expandedString = new StringBuilder();

        for(int currentIndex = 0; currentIndex < inputString.length(); currentIndex++) {
            // Checks for Character
            if(Character.isLetter(inputString.charAt(currentIndex))) {
                // Calls The method to expand the previous Character
                if(numberOfTimesCharacterOccurs != 0) {
                    expandedString.append(expandTheCharacter(currentCharacter, numberOfTimesCharacterOccurs));
                    numberOfTimesCharacterOccurs = 0;
                }
                currentCharacter = inputString.charAt(currentIndex);
            }

            // Checks for Digits
            if(Character.isDigit(inputString.charAt(currentIndex))) {
                numberOfTimesCharacterOccurs = (numberOfTimesCharacterOccurs * 10) + Integer.parseInt(Character.toString(inputString.charAt(currentIndex)));
            }
        }

        // Expands the last Character
        expandedString.append(expandTheCharacter(currentCharacter, numberOfTimesCharacterOccurs));

        return expandedString.toString();
    }

    private String expandTheCharacter(char characterOccurred, int numberOfTimesCharacterOccurs) {

        return String.valueOf(characterOccurred).repeat(Math.max(0, numberOfTimesCharacterOccurs));
    }
}
