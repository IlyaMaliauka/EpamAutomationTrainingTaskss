package com.epam.javacollections.maintask.saladmaker;

import com.epam.javacollections.maintask.veggies.Vegetable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaladMaker {
    private ArrayList<Vegetable> ingredientsPlate = new ArrayList<>();

    public void addToIngredients (Vegetable vegetable) { ingredientsPlate.add(vegetable); }

    public void displayIngredients () {
        System.out.println("Your future salad ingredients are: " + ingredientsPlate);
    }


    public void cookSalad() {
        System.out.println("\nLet the cooking begin!");
        for (Vegetable c : ingredientsPlate) {
            c.cook();
        }
        System.out.println("Your salad is READY, chef!");
    }

    public void getSaladCalories() {
        int calorieCounter = 0;
        for (Vegetable c : ingredientsPlate) {
            calorieCounter += c.getCalories();
        }
        System.out.println("\nThere are " + calorieCounter + " calories in your salad, sir.");
    }

    public void getSaladWeight() {
        int weight = 0;
        for (Vegetable c : ingredientsPlate) {
            weight += c.getWeight();
        }
        System.out.println("\nYour salad weighs " + weight + " grams, sir.");
    }

    public void sortByWeight() {
        ingredientsPlate.sort(Comparator.comparing(Vegetable::getWeight));
        System.out.println("\nVegetables in your salad sorted by weight (from low to high): ");
        System.out.println(ingredientsPlate);
    }

    public void sortInCalorieRange (int rangeBottom, int rangeTop) {
        List<Vegetable> list = new ArrayList<>();
        System.out.println("\nSalad vegetables in certain calorie range (0-100 cals): ");
        for (Vegetable c : ingredientsPlate) {
            if (c.getCalories() >= rangeBottom && c.getCalories() <= rangeTop) {
                list.add(c);
                System.out.println(c);
            }
        }
    }
}
