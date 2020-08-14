package com.epam.javafundamentals;

import  java.util.Scanner;
import java.util.Random;

public class PointThree {
    public static void randomNumbersOutput() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you desire to be randomly generated, sir?: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt();
            System.out.println(randomNumber + " "); //print чтобы вывести без перехода на новую строку
        }
    }
}
