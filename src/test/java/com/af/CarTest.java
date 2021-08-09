package com.af;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {

    @Test(groups = {"Scooter"})
    public static void scooterTestOne() {
        System.out.println("First Scooter.");
        Assert.assertEquals(1, 1);
        //Assert.assertEquals(1,2);

    }

    @Test(groups = {"Scooter"}, alwaysRun = true)
    public static void scooterTestTwo() {
        System.out.println("Second Scooter.");
        Assert.assertTrue(true);
        //Assert.assertTrue(false);
        //Assert.fail("It failed.");

    }

    @Test(groups = {"Car"})
    public static void carTestOne() {
        System.out.println("First Car.");
        int a = 5;
        int b = 7;
        Assert.assertTrue(a < b);

    }

    @Test(groups = {"Car"})
    public static void carTestTwo() {
        System.out.println("Second Car.");

    }

    @Test(groups = {"Car", "Sedan Car"})
    public static void carSedanTestOne() {
        System.out.println("First Car Sedan.");

    }

}