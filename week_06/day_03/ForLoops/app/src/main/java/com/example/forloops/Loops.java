package com.example.forloops;

/**
 * Created by allysonwilson on 9/15/17.
 */

public class Loops {


    public static String[] allCaps(String[] names) {
        String[] inCaps = new String[];

//        create for loop, condition, action
        for (int i = 0; i < names.length; i++){
            names[i].toUpperCase();
        }
    }


    public static ArrayList<String>  allCapsArrayList(ArrayList<String> names){

        Arraylist<String> allCaps = new ArrayList<String>;

        for (String name : names) {
            String nameInCaps = name.toUpperCase();
            allCaps.add(nameInCaps);
        }
        return allCaps;

    }

}