package com.sort.algorithm;

/**
 * Implementation of insertion sort algorithm
 *
 * @author bassem
 */
public class InsertionSortJava8 {

    public static void selectionSort(int[] array) {
        int lengthArray = array.length;
        /**
         * loop on all array members to find ths smaller value
         */
        for (int i = 0; i < lengthArray; i++) {
            int minIndex = i;
            for (int j = i + 1; j < lengthArray; j++) {
                minIndex = (array[j] < array[minIndex]) ? j : minIndex;
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}