package com.epam.javafundamentals;

import  java.util.Scanner;

public class PointTwo {
    public static void reversedArgumentsOutput() {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you desire to enter, sir?: ");
        int j = scanner.nextInt();
        array = new int[j];
        for (int i = 0; i < j; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt ();
        }
        System.out.print("Reversed numbers are: ");
        for(int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}