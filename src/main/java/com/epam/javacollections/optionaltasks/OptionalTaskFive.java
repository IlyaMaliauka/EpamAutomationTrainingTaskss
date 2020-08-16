package com.epam.javacollections.optionaltasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class OptionalTaskFive {
    public static List<Integer> createNewList() {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random(System.currentTimeMillis());
        for(int i = 0; i < 10; i++) {
            int number = -1500 + random.nextInt(1500 + 1500);
            integers.add(number);
        }
        return integers;
    }


    public static void sortNegativeAndPositive() {
        List<Integer> list = createNewList();
        System.out.println("\nRandom number list: " + list);
        List<Integer> result = list.stream().sorted((o1, o2) -> o2).collect(Collectors.toList());
        System.out.println("Random number list sorted by negative and positive numbers: " + result);
    }
}
