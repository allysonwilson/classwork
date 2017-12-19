package com.example.polymorphism;

/**
 * Created by allysonwilson on 9/6/17.
 */

public class Trout implements Edible{
    private int calories;

    public Trout() {
        calories = 50;
    }

    public int getCalories() {
        return calories;
    }
}
