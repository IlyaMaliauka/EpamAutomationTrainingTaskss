package com.epam.javafundamentals;

import java.util.Arrays;
import java.util.Scanner;


public class OptionalTaskTwo {

    public static void outputByLength() {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you desire to enter, sir?: ");
        int n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Numbers sorted by length: ");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}