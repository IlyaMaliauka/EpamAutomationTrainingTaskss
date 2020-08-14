package com.epam.javafundamentals;

import  java.util.Scanner;

public class PointFive {
    public static void findMonthCorrespondingToEnteredNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 12: ");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("The month corresponding to number " + a + " is January.");
                break;
            case 2:
                System.out.println("The month corresponding to number " + a + " is February.");
                break;
            case 3:
                System.out.println("The month corresponding to number " + a + " is March.");
                break;
            case 4:
                System.out.println("The month corresponding to number " + a + " is April.");
                break;
            case 5:
                System.out.println("The month corresponding to number " + a + " is May.");
                break;
            case 6:
                System.out.println("The month corresponding to number " + a + " is June.");
                break;
            case 7:
                System.out.println("The month corresponding to number " + a + " is July.");
                break;
            case 8:
                System.out.println("The month corresponding to number " + a + " is August.");
                break;
            case 9:
                System.out.println("The month corresponding to number " + a + " is September.");
                break;
            case 10:
                System.out.println("The month corresponding to number " + a + " is October.");
                break;
            case 11:
                System.out.println("The month corresponding to number " + a + " is November.");
                break;
            case 12:
                System.out.println("The month corresponding to number " + a + " is December.");
                break;
            default:
                System.out.println("Whoops, you've just entered the wrong number!");
        }
    }
}