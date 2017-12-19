package com.example.forloops;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/15/17.
 */

public class LoopsTest {

    @Test
    public void primitiveArray(){
        String[] names = {
                "Craig",
                "Iain",
                "David",
                "Allyson"
        };

        String[] inCaps = Loops.allCaps(names);
        String
        assertEquals( {"CRAIG", "IAIN", "DAVID", "ALLYSON"}, names);
    }

    @Test
    public void arraylist(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Craig");
        names.add("Daniel");

        ArrayList<String> uppercaseNames = Loops.allCapsArraylList(names);
        ArrayList<String> expected = new ArayList<String>();


    }
}
