package com.af.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test6 {

    @BeforeMethod
    public static void firstTest() {
        System.out.println("Before method(6).");
    }

    @Test
    public static void createUserTest() {
        System.out.println("Test 6.1");
    }

    @Test
    public static void createUserTest1() {
        System.out.println("Test 6.2");
    }

    @Test
    public static void createUserTest2() {
        System.out.println("Test 6.3");
    }
}
