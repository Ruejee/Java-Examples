package com.equinetworks.collections.arrays;

public class SortingAlgoritms extends ArraysLauncher {

    /**
     * Algoritms of auto sortings input int data
     * of massive form user with scanner
     * This is a lack of memory example, bad practice to use in real development
     * use only for understanding how work sorting with this methods
     *
     * @param array
     * @return
     */

    static int[] sort(int[] array)  {
        // int[] myNewArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    // 10, 5, 16, 4
    // 5, 10, 16, 4
    // 5, 10, 4, 16
    // 5, 4, 10, 16
    // 4, 5, 10, 16

}
