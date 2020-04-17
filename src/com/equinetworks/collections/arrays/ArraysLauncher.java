package com.equinetworks.collections.arrays;

import java.util.Scanner;

/**
 * Java Collection
 * - Arrays
 * - Arrays Sorting with simple algoritms
 * understand how works arrays in example from simple
 * to complicated multi.arrays list and how to work with it.
 */

public class ArraysLauncher {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
// Example of simple arrays masive

//                int[] myArray = new int[10];
//                myArray[0] = 0;
//                myArray[1] = 100;
//                myArray[2] = 200;
//                myArray[3] = 300;
//                myArray[4] = 400;
//                myArray[5] = 500;
//                myArray[9] = 900;

// Example of alternative declaring massive if we know elements of massive from start

//        int[] myArray = {0, 100, 200, 300, 400, 500};
        int[] myArray = new int[8];

        // Show one elements of massive

        //  System.out.println("Elements 4 = "+myArray[4]);

        // Show multi elements from masive with (for) cycling only if we know elements of massive fom start

//        for (int i = 0; i < 6; i++) {
//            System.out.println("Elements #" + i + " = " + myArray[i]); }

        System.out.println("Please input 8 int elements");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Next elements :");
            myArray[j] = scanner.nextInt();
        }

        int[] array = SortingAlgoritms.sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Elements #" + i + " = " + myArray[i]);
        }


    }

}
