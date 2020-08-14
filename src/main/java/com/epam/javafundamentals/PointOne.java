package com.epam.javafundamentals;

import java.util.Scanner;

public class PointOne {
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, sir : ");
        String name = scanner.nextLine();
        System.out.println("Greetings, " + name + "!");
    }
}
