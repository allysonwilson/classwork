package com.example.allysonwilson.tddintro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/5/17.
 */

public class RobotTest {
    Robot robot;

    @Before
    public void before(){
        robot = new Robot("C3PO", "Gold");
    }


    @Test
    public void testRobotSetup() {
        Robot robot = new Robot("C3PO", "Gold");
        assertEquals("C3PO", robot.getName());
        assertEquals("Gold", robot.getColour());
    }

    @Test
    public void testCheckBattery() {
        assertEquals(100.0, robot.getBattery(), 0.01);
    }

    @Test
    public void testMakeDrink() {
        String task = robot.makeDrink("Tea");
        assertEquals("I am making Tea", task);
        assertEquals(90.0, robot.getBattery(), 0.01);
    }

    @Test
    public void testWashDishes() {
        String task = robot.washDishes();
        assertEquals("I am washing the bloody dishes again.", task);
        assertEquals( 70.0, robot.getBattery(), 0.01);
    }
    @Test
    public void testRechargeBattery(){
        String task = robot.washDishes();
        double battery = robot.getBattery();
        assertEquals(70.0, battery, 0.01);
        robot.rechargeBattery();
        assertEquals(100.0 , robot.getBattery(), 0.01);
    }



}