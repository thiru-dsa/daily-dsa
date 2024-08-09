package com.dsa;

public class SortTheArrayBasedOnPosition {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        sortEvenElementsInAscendingOrderAndOddElementInDescendingOrder(array);

        print(array);
    }

    private static void sortEvenElementsInAscendingOrderAndOddElementInDescendingOrder(int[] array) {
        int arrayLength = array.length;

        for(int iterator = 0; iterator < arrayLength; iterator+=2) {
            for(int jterator = iterator+2; jterator < arrayLength; jterator+=2) {
                if(array[iterator] < array[jterator]) {
                    swap(array, iterator, jterator);
                }
            }
        }

        for(int iterator = 1; iterator < arrayLength; iterator+=2) {
            for(int jterator = iterator+2; jterator < arrayLength; jterator+=2) {
                if(array[iterator] > array[jterator]) {
                    swap(array, iterator, jterator);
                }
            }
        }
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static void print(int[] array) {
        for(int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
    }
}
