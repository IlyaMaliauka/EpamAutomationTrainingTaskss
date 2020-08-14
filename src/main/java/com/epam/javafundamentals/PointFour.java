package com.epam.javafundamentals;

import java.util.Scanner;

public class PointFour {

    public static void findSumOfEnteredNumbers() {
        int[] array;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you desire to enter, sir?: ");
        int j = scanner.nextInt();
        array = new int[j];
        for (int i = 0; i < j; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt ();
            result += array[i]; //если умножаем, то переменной res присваиваем 1, иначе результат всегда будет 0
        }
        System.out.println("The result is : " + result);
    }
}
