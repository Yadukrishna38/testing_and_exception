package com.lcwd.test.services;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTestJunit5 {

//    execute the logic before the test cases
    @BeforeAll
    public static void initialize(){
        System.out.println("This is single time logic:");
    }
    @BeforeEach
    public void eachTestCase(){
        System.out.println("Runs before each testCase: ");
    }
    @AfterEach
    public void AfterEachCase(){
        System.out.println("Runs After each case");
    }
    @Test
    @Tag("This_is_used_to_categorise_and_then_used_tofilter_run_together")
    @Disabled
    public void addTwoNumbersTest(){
        System.out.println("First testCase");
        int actualResult = CalculatorService.addTwoNumbers(20,20);
        int expectedRes = 40;
        Assertions.assertEquals(expectedRes,actualResult,"test failed");

    }
    @Test
    @DisplayName("TestCase for add nos")
    public void addAnyNumbersTest(){
        System.out.println("Second testCase");
        int res = CalculatorService.sumAnyNumbers(1,2,3);
        int expected = 6;

        Assertions.assertEquals(expected,res);


    }
    @AfterAll
    public static void cleanup(){
        System.out.println("After last cleanup");

    }

}
