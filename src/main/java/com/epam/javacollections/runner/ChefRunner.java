package com.epam.javacollections.runner;

import com.epam.javacollections.saladmaker.SaladMaker;
import com.epam.javacollections.veggies.boiled.VeggiesNeedBoiling;
import com.epam.javacollections.veggies.boiled.VeggiesNeedBoilingEnum;
import com.epam.javacollections.veggies.raw.RawVeggie;
import com.epam.javacollections.veggies.raw.RawVeggieEnum;
import com.epam.javacollections.veggies.veggieswithseeds.VeggiesWithSeeds;
import com.epam.javacollections.veggies.veggieswithseeds.VeggiesWithSeedsEnum;

public class ChefRunner {
    public static void main(String[] args) {
        SaladMaker vegetableSalad = new SaladMaker();
        vegetableSalad.addToIngredients(new RawVeggie(150, 40, "23", RawVeggieEnum.RawVeggiesType.CUCUMBER));
        vegetableSalad.addToIngredients(new VeggiesWithSeeds(150, 238, "4", VeggiesWithSeedsEnum.VeggiesSeedsType.AVOCADO));
        vegetableSalad.addToIngredients(new RawVeggie(300, 24, "67",RawVeggieEnum.RawVeggiesType.TOMATO));
        vegetableSalad.addToIngredients(new VeggiesNeedBoiling(300, 251, "37", VeggiesNeedBoilingEnum.BoilingVeggiesType.PUMPKIN));
        vegetableSalad.addToIngredients(new VeggiesNeedBoiling(239,79 , "93", VeggiesNeedBoilingEnum.BoilingVeggiesType.SQUASH));
        vegetableSalad.displayIngredients();
        vegetableSalad.cookSalad();
        vegetableSalad.getSaladCalories();
        vegetableSalad.getSaladWeight();
        vegetableSalad.sortInCalorieRange(0, 100);
        vegetableSalad.sortByWeight();
        }
    }

