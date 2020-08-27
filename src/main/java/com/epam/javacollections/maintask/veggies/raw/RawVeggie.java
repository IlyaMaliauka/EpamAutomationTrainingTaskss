package com.epam.javacollections.maintask.veggies.raw;

import com.epam.javacollections.maintask.veggies.Vegetable;

public class RawVeggie extends Vegetable {
    RawVeggieEnum rawVeggiesType;
    public RawVeggie(int weight, int calories, String refrigeratorLot, RawVeggieEnum type) {
        super(weight, calories, refrigeratorLot);
        rawVeggiesType = type;
    }

    public RawVeggieEnum getRawVeggiesType() {
        return rawVeggiesType;
    }

    @Override
    public void cook() {
        System.out.print("*Let's add fresh and delicious " + getRawVeggiesType() + " to your salad...");
        System.out.println("*Defrosting, washing, peeling, cutting*\nDone!");
    }

    @Override
    public String toString() {
        return rawVeggiesType + " (Refrigerator lot= " + getRefrigeratorLot() + "; Weight= " + getWeight() + "; Calories= " + getCalories() + ")";    }
}
