package com.af;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;
@Slf4j

public class Test1 {

    @BeforeTest
    public void preconditions() {
        System.out.println("Before test (1).");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class(1).");
    }

    @BeforeMethod
    public static void firstTest() {
        System.out.println("Before method(1).");
    }

    @Test
    public static void createUserTest() {
        System.out.println("Test 1.1");
        log.info("[TEST]:: First log");
    }

    @Test
    public static void userSaysTest() {
        System.out.println("Test 1.2");

    }


}
