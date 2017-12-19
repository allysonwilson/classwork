package com.example.polymorphism;

/**
 * Created by allysonwilson on 9/6/17.
 */
import org.junit.Test;


import static org.junit.Assert.*;

public class BearTest {
    @Test
    public void canEatSalmon() {
        // arrange
        Bear bear = new Bear();
        Salmon fishy = new Salmon();
        // act
        bear.eat(fishy);
        // assert
        assertEquals(200, bear.getEnergy());
    }

    @Test
    public void canEatTrout(){
//        arrange
        Bear bear = new Bear();
        Trout fishy = new Trout();
//        act
        bear.eat(fishy);
        assertEquals(50, bear.getEnergy() );
    }
}