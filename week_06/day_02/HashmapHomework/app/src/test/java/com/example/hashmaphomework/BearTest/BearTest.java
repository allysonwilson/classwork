package com.example.hashmaphomework.BearTest;

/**
 * Created by allysonwilson on 9/5/17.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
}



    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        assertEquals( 1 , bear.foodCount() );
    }