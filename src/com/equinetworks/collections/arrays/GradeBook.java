package com.equinetworks.collections.arrays;

import java.util.Arrays;

public class GradeBook {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 99, 90},
                {99, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 99},
                {76, 72, 84},
                {87, 93, 73}};
        System.out.println("Minimal grade " + calcMin((gradesArray)));
        System.out.println("Maximal grade " + calcMax((gradesArray)));
        varArgs();
        processArrays();
    }

    private static int calcMin(int[][] grades) {
        int min = 100;
        for (int[] row : grades) {
            for (int i : row) {
                if (min > i) {
                    min = i;

                }
            }
        }
        return min;
    }

    private static int calcMax(int[][] grades) {
        int max = 0;
        for (int[] row : grades) {
            for (int i : row) {
                if (max < i) {
                    max = i;
                }
            }
        }
        return max;
    }

    private static void varArgs() {
        double a = 0.56;
        double b = 1.92;
        double c = 3.45;
        double d = 5.01;
        double e = 0.56;


        System.out.println("Average of 2 elements is " + calcAverage(a, b));
        System.out.println("Average of 2 elements is " + calcAverage(a, b, c));
        System.out.println("Average of 2 elements is " + calcAverage(a, b, c, d, e));
    }

    private static double calcAverage(double... args) {
        double sum = 0;
        for (double i : args) {
            sum = sum + i;
        }
        return sum / args.length;
    }

    /**
     * Good practice to use Arrays.* with algoritms for sorting
     * have less code with some result
     * DO NOT REPEAT YOURSELF ))
     */

    private static void processArrays() {
        double[] doubleArray = {8.9, 5.56, 8.12, 45.0, 77.1};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        int[] filledArray = new int[7];
        Arrays.fill(filledArray, 7);
        System.out.println(Arrays.toString(filledArray));

        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayCopy = new int[10];

        System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);
        System.out.println(Arrays.toString(arrayCopy));
    }


}
