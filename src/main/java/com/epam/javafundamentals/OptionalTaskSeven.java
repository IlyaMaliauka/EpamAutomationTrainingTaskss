package com.epam.javafundamentals;

import java.util.Scanner;

public class OptionalTaskSeven {
        public static void findTheNumberWithUniqueDigits() {
            Scanner scanner = new Scanner(System.in);
            Scanner in = new Scanner(System.in);
            System.out.print("How many numbers do you desire to enter, sir?: ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter your number, sir: ");
                array[i] = in.nextInt();
                if (isDifferent(array[i])) {
                    System.out.println("The first number with unique digits is: " + array[i]);
                    break;
                }
                else System.out.println("Not our case!");
            }
        }
        private static boolean isDifferent(int a) {
            String string = String.valueOf(a);
            for (int i = 0; i < string.length() - 1; i++) {
                for (int j = i + 1; j < string.length(); j++) {
                    if (string.charAt(i) == string.charAt(j)) return false;
                }
            }
            return true;
        }
    }
