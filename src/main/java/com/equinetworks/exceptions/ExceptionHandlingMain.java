package com.equinetworks.exceptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Only for testing and understand how work Exception
 * Bad practice to use in live work something like this :)
 *
 * God code the world in 7 day on Java ;)
 *
 */

public class ExceptionHandlingMain {
    public static void main(String[] args) throws IOException {

        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }

    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
                 BufferedReader reader = new BufferedReader(new FileReader("out.txt"))) {
                System.out.println("Please enter numerator ");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator");
                int denominator = scanner.nextInt();
//                System.out.println(divide(numerator, denominator));
//                int[] intArray = new int[1];
//                int i = intArray[2];
                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Catch all Exception");
                throw new InvalidInputParamException("Index out of bound. throw in doEverything " + e);
            } finally {
                System.out.println("Finally block was called");
            }
            System.out.println("Try Catch block finished");
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) throws NullPointerException, InputMismatchException {
        return numerator / denominator;
    }

    /*
    private static void saveToFile(int res) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
        writer.println("Result = " + res);
        writer.close();
    }*/

}
