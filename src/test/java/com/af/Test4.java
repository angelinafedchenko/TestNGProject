package com.af;

import org.testng.annotations.*;

public class Test4 {

    @BeforeMethod
    public static void firstTest() {
        System.out.println("Before method(4).");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class(4).");
    }

    @Test
    public static void someActionOne() {
        System.err.println("Test 4.1");
    }

    @Test
    public static void someActionTwo() {
        System.err.println("Test 4.2");
    }
}