package com.epam.javacollections.veggies;

public abstract class Vegetable {
    private int calories;
    private int weight;
    private String refrigeratorLot;

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    public String getRefrigeratorLot() {
        return refrigeratorLot;
    }

    public Vegetable(int weight, int calories, String refrigeratorLot) {
        this.weight = weight;
        this.calories = calories;
        this.refrigeratorLot = refrigeratorLot;
    }

    public abstract void cook();

    @Override
    public String toString() {
        return "Vegetable{" +
                "calories=" + calories +
                ", weight=" + weight +
                ", id='" + refrigeratorLot + '\'' +
                '}';
    }
}
