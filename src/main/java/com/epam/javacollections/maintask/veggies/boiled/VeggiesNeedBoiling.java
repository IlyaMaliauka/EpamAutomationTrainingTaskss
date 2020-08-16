package com.epam.javacollections.maintask.veggies.boiled;

import com.epam.javacollections.maintask.veggies.Vegetable;

public class VeggiesNeedBoiling extends Vegetable {
    VeggiesNeedBoilingEnum.BoilingVeggiesType boilingVeggiesType;
    public VeggiesNeedBoiling(int weight, int calories, String refrigeratorLot, VeggiesNeedBoilingEnum.BoilingVeggiesType type) {
        super(weight, calories, refrigeratorLot);
    boilingVeggiesType = type;
    }

    public VeggiesNeedBoilingEnum.BoilingVeggiesType getBoilingVeggiesType() {
        return boilingVeggiesType;
    }

    @Override
    public void cook() {
        System.out.print("*Let's add fresh and delicious " + getBoilingVeggiesType() + " to your salad...");
        System.out.println("*Defrosting, washing, peeling, boiling, cutting*\nDone!");
    }

    @Override
    public String toString() {
        return boilingVeggiesType + " (Refrigerator Lot= " + getRefrigeratorLot() + "; Weight= " + getWeight() + "; Calories= " + getCalories() + ")";
    }
}
