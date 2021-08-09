package com.af;

import org.testng.annotations.*;

public class Test2 {


    @BeforeMethod
    public static void firstTest() {
        System.out.println("Before method(2).");
    }


    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class(2).");
    }


    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("Before Suite(2).");
    }


    @Test
    public static void someActionOne() {
        System.err.println("Test 2.1");
    }

    @Test
    public static void someActionTwo() {
        System.err.println("Test 2.2");
    }
}