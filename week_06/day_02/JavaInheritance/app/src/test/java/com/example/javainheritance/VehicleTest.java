package com.example.javainheritance;

/**
 * Created by allysonwilson on 9/5/17.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VehicleTest {
        Car car;
        MotorBike motorbike;

    @Before
    public void before(){
        car = new Car();
        motorbike = new MotorBike();

    }
    @Test
    public void testCarHasFourWheels(){
        assertEquals(4, car.getNumwheels() );
    }

    @Test
    public void testCarGoesVrrm(){
        String result = car.startEngine();
        assertEquals("Vrrm", result);
    }
    @Test
    public void testMotorbikeHasTwoWheels(){
        assertEquals(2, motorbike.getNumWheels() );
    }
//    @Test
//    public void testMotorbikeIsObnoxious(){
//        String result = motorbike.startEngine();
//        assertEquals();
//    }


}
