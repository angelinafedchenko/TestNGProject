package com.af.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5 {

    @BeforeMethod
    public static void firstTest() {
        System.out.println("Before method(4).");
    }

    @Test
    public static void createUserTest() {
        System.out.println("Test 5.1");
    }

    @Test
    public static void createUserTest1() {
        System.out.println("Test 5.2");
        assert false;
    }

    @Test
    public static void createUserTest2() {
        System.out.println("Test 5.3");
    }
}
