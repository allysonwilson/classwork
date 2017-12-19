package com.example.polymorphism;

/**
 * Created by allysonwilson on 9/6/17.
 */

public class Salmon implements Edible{
    private int calories;

    public Salmon() {
        calories = 200;
    }


    public int getCalories() {
        return calories;
    }
}
