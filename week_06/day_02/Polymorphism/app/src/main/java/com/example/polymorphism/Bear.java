package com.example.polymorphism;

/**
 * Created by allysonwilson on 9/6/17.
 */

public class Bear {
    private int energy;

    public Bear() {
        energy = 0;
    }

    public void eat(Edible food) {
        Edible salmon;
        energy += salmon.getCalories();
    }

    public int getEnergy() {
        return energy;
    }

}