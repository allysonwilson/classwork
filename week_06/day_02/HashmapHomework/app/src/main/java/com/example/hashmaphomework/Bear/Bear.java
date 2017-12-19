
/**
 * Created by allysonwilson on 9/5/17.
 */


package com.example.hashmaphomework.Bear;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Map;
//import java.util.Iterator;
//import java.util.Set;



public class Bear {

   private ArrayList<Fish> belly;
    private HashMap<String, Integer> journal;

    public Bear() {
        belly = new ArrayList<>();
        journal = new HashMap<>();
    }

    public void eat(Fish fish, String day) {
        belly.add(fish);

        if ( journal.containsKey(day) ){
            int newCount = journal.get(day) + 1;
            journal.put(day, newCount);
        }

    }

    public void initJournal() {
        journal.clear();
        journal.put("Monday", 0);
        journal.put("Tuesday", 0);
        journal.put("Wednesday", 0);
        journal.put("Thursday", 0);
        journal.put("Friday", 0);
        journal.put("Saturday", 0);
        journal.put("Sunday", 0);

    }

    public void resetJournal() {
        for (String day: journal.keySet() ) {
            journal.put(day, 0);
        }
    }
}


//    public static void main(String args[]) {
//        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
//
//        HMap.put(key, value)
//    }
//
//
//
//
//for( Map.Entry <Integer, String > entry : Map.entrySet )
//
//    int key =entry.getKey();
//    String value = entry.getValue();
//    System.out.println( key + " : " +value);