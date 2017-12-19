package com.example.magiceightball;

/**
 * Created by allysonwilson on 9/14/17.
 */

public class RandomNumberGenerator implements NumberGenerating {
    public int generateNumber( int upperLimit){
        Random random = new Random();
        int randomNumber = random.nextInt(upperLimit);
        return randomNumber;

    }
}
