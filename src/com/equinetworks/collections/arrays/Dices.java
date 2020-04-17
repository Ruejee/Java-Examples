package com.equinetworks.collections.arrays;

import java.security.SecureRandom;

/**
 * Java Collection
 * - Multi Dimensional Massive (Dice Game) for Example
 * - Arrays Index
 * understand how works arrays in example from simple
 * to complicated multi.arrays list and how to work with it.
 */
public class Dices {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }
        for (int i = 1; i < frequency.length; i++) {
            System.out.println("Side " + i + " :" + frequency[i]);
        }
        multidimArrayLaucher();
    }

    private static void multidimArrayLaucher() {
        // arr[0][0], arr[0][1], arr[0][2]
        // arr[1][0], arr[1][1], arr[1][2]
        // arr[2][0], arr[2][1], arr[2][2]

        int[][] a = {{1, 2},
                {3, 4, 5, 6},
                {7, 8, 9}};

        int[][] b = new int[3][3];

        int[][] c = new int[2][];
        c[0] = new int[2];
        c[0] = new int[4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


}
