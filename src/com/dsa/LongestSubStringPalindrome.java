package com.dsa;

public class LongestSubStringPalindrome {

    public static void main(String[] args) {

        String testCase1 = "abcdef";
        String testCase2 = "madam";
        String testCase3 = "anamadam";
        String testCase4 = "a";
        String testCase5 = "abbccd";
        String testCase6 = "";

        PalindromeFinder finder = new PalindromeFinder();

        System.out.println("Longest SubString Palindrome of \"" + testCase1 + "\" is " + "\"" + finder.findLongestPalindromeSubString(testCase1) + "\"");
        System.out.println("Longest SubString Palindrome of \"" + testCase2 + "\" is " + "\"" + finder.findLongestPalindromeSubString(testCase2) + "\"");
        System.out.println("Longest SubString Palindrome of \"" + testCase3 + "\" is " + "\"" + finder.findLongestPalindromeSubString(testCase3) + "\"");
        System.out.println("Longest SubString Palindrome of \"" + testCase4 + "\" is " + "\"" + finder.findLongestPalindromeSubString(testCase4) + "\"");
        System.out.println("Longest SubString Palindrome of \"" + testCase5 + "\" is " + "\"" + finder.findLongestPalindromeSubString(testCase5) + "\"");
        System.out.println("Longest SubString Palindrome of \"" + testCase6 + "\" is " + "\"" + finder.findLongestPalindromeSubString(testCase6) + "\"");
    }

}

class PalindromeFinder {

    public String findLongestPalindromeSubString(String inputString) {
        String longestPalindrome = "";
        int stringLength = inputString.length();

        for(int currentIndex = 0; currentIndex < stringLength; currentIndex++) {

            // Expand around the center for odd length palindromes
            String oddPalindrome = findPalindromeAroundCenter(inputString, currentIndex, currentIndex);
            if(oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }

            // Expand around the center for even length palindromes
            String evenPalindrome = findPalindromeAroundCenter(inputString, currentIndex , currentIndex + 1);
            if(evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        return  longestPalindrome;
    }

    private String findPalindromeAroundCenter(String inputString, int leftPointer, int rightPointer) {
        while(leftPointer >= 0 && rightPointer < inputString.length() && inputString.charAt(leftPointer) == inputString.charAt(rightPointer)) {
            leftPointer--;
            rightPointer++;
        }

        return inputString.substring(leftPointer + 1, rightPointer);
    }
}
