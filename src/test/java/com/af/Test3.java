package com.af;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {

    @BeforeTest
    public void preconditions() {
        System.out.println("Before test (3).");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class(3).");
    }

    @BeforeMethod
    public static void firstTest() {
        System.out.println("Before method(3).");
    }

    @Test
    public static void createUserTest() {
        System.out.println("Test 3.1");

    }

    @Test
    public static void userSaysTest() {
        System.out.println("Test 3.2");

    }

}
