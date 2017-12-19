package com.example.javainheritance;

/**
 * Created by allysonwilson on 9/5/17.
 */

public class MotorBike extends Vehicle{
    public MotorBike()  {
        super(2);
    }

    public String startEngine() {
        return super.startEngine() + "! Hell Yeah!";
    }

}
