package com.epam.javacollections.maintask.runner;

import com.epam.javacollections.maintask.saladmaker.SaladMaker;
import com.epam.javacollections.maintask.veggies.boiled.VeggiesNeedBoiling;
import com.epam.javacollections.maintask.veggies.boiled.VeggiesNeedBoilingEnum;
import com.epam.javacollections.maintask.veggies.raw.RawVeggie;
import com.epam.javacollections.maintask.veggies.raw.RawVeggieEnum;
import com.epam.javacollections.maintask.veggies.veggieswithseeds.VeggiesWithSeeds;
import com.epam.javacollections.maintask.veggies.veggieswithseeds.VeggiesWithSeedsEnum;

public class ChefRunner {
    public static void main(String[] args) {
        SaladMaker vegetableSalad = new SaladMaker();
        vegetableSalad.addToIngredients(new RawVeggie(150, 40, "23", RawVeggieEnum.CUCUMBER));
        vegetableSalad.addToIngredients(new VeggiesWithSeeds(150, 238, "4", VeggiesWithSeedsEnum.AVOCADO));
        vegetableSalad.addToIngredients(new RawVeggie(300, 24, "67",RawVeggieEnum.TOMATO));
        vegetableSalad.addToIngredients(new VeggiesNeedBoiling(300, 251, "37", VeggiesNeedBoilingEnum.PUMPKIN));
        vegetableSalad.addToIngredients(new VeggiesNeedBoiling(239,79 , "93", VeggiesNeedBoilingEnum.SQUASH));
        vegetableSalad.displayIngredients();
        vegetableSalad.cookSalad();
        vegetableSalad.getSaladCalories();
        vegetableSalad.getSaladWeight();
        vegetableSalad.sortInCalorieRange(0, 100);
        vegetableSalad.sortByWeight();
        }
    }

