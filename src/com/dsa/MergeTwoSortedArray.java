package com.dsa;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] array2 =  {2, 3, 4, 5, 6, 7, 8, 9, 11, 15, 15, 15, 15, 15, 15};

        int[] result = mergeSortedArrays(array1, array2);

        print(result);
    }

    private static int[] mergeSortedArrays(int[] array1, int[] array2) {

        int iterator = 0;
        int jterator = 0;
        int kterator = 0;
        int array1Length = array1.length;
        int array2Length = array2.length;
        int[] mergedArray = new int[array1Length + array2Length];

        while(iterator < array1Length && jterator < array2Length) {
            if(array1[iterator] <= array2[jterator]) {
                if(iterator != 0 && array1[iterator] != array2[jterator]) {
                    mergedArray[kterator++] = array1[iterator];
                }
                iterator++;
            }
            else {
                if(iterator != 0 && array1[iterator] != array2[iterator - 1]) {
                    mergedArray[kterator++] = array2[jterator];
                }
                jterator++;
            }
        }

        while(iterator < array1Length) {
            if(iterator != 0 && array1[iterator] != array1[iterator - 1]) {
                mergedArray[kterator++] = array1[iterator];
            }
            iterator++;
        }

        while(jterator < array2Length) {
            if(jterator != 0 && array2[jterator] != array2[jterator - 1]) {
                mergedArray[kterator++] = array2[jterator];
            }
            jterator++;
        }

        return mergedArray;
    }

    private static void print(int[] array) {
        for(int arrayElement : array) {
            if(arrayElement != 0) System.out.print(arrayElement + " ");
        }

        System.out.println();
    }
}
