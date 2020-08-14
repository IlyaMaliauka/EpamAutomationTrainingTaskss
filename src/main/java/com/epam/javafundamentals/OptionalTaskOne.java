package com.epam.javafundamentals;

import java.util.Arrays;
import java.util.Scanner;


public class OptionalTaskOne {

    public static void findShortestAndLongestNumberAndLengthOutput() {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you desire to enter, sir?: ");
        int n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int maxLength = String.valueOf(array[0]).length();
        int minLength = String.valueOf(array[n-1]).length();
        System.out.println("The shortest number is " + array[0] + ". It's length is " + maxLength);
        System.out.println("The longest number is " + array[n-1] + ". It's length is " + minLength);
    }
}
