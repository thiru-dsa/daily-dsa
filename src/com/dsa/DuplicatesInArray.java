package com.dsa;

import java.util.HashMap;

public class DuplicatesInArray {

    public static void main(String[] args) {

        int[] array = {1, 3, 4, 2, 3, 4, 6, 3, 7, 4, 5, 6, 4, 3, 2, 1};

        findDuplicatesInArray(array);
    }

    public static void findDuplicatesInArray(int[] array) {

        HashMap<Integer, Integer> arrayMap = new HashMap<>();

        for(int arrayElement : array) {

            if(arrayMap.containsKey(arrayElement)) {
                arrayMap.put(arrayElement, arrayMap.get(arrayElement) + 1);
            }

            if(!arrayMap.containsKey(arrayElement)) {
                arrayMap.put(arrayElement, 1);
            }
        }

        printDuplicateOccurranceInArray(arrayMap);
    }

    public static void printDuplicateOccurranceInArray(HashMap<Integer, Integer> arrayMap) {

        for(int arrayElement : arrayMap.keySet()) {
            System.out.println(arrayElement + " appears " + arrayMap.get(arrayElement) + " times");
        }
    }

}
