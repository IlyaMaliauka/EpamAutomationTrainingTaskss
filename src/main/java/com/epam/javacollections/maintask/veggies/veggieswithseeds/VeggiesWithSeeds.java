package com.epam.javacollections.maintask.veggies.veggieswithseeds;

import com.epam.javacollections.maintask.veggies.Vegetable;

public class VeggiesWithSeeds extends Vegetable {
    VeggiesWithSeedsEnum veggiesSeedsType;
    public VeggiesWithSeeds(int weight, int calories, String refrigeratorLot, VeggiesWithSeedsEnum type) {
        super(weight, calories, refrigeratorLot);
        veggiesSeedsType = type;
    }

    public VeggiesWithSeedsEnum getVeggiesSeedsType() {
        return veggiesSeedsType;
    }

    @Override
    public void cook() {
        System.out.print("*Let's add fresh and delicious " + getVeggiesSeedsType() + " to your salad...");
        System.out.println("*Defrosting, washing, peeling, removing seeds, cutting*\nDone!");
    }

    @Override
    public String toString() {
        return veggiesSeedsType + " (Refrigerator Lot= " + getRefrigeratorLot() + "; Weight= " + getWeight() + "; Calories= " + getCalories() + ")";    }
}
