//package com.lcwd.test.services;
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    int counter = 0;
//    @BeforeClass
//    public static void init(){
////        Date date = new Date();
//        System.out.println("Before all the test cases:");
//        System.out.println("Started Test at: "+ new Date()); // this gives us the date and time
//
//    }
//
//    @Before // executes before each test cases
//    public void beforeEach(){
//        System.out.println("##-- Before each --##");
//        counter = 0;
//    }
//
//    @Test
//    public void addTwoNumbersTest(){
//
//        for (int i=0; i<10; i++){
//            counter +=i; //55
//        }
//        int result = CalculatorService.addTwoNumbers(10,20);
//        int expected = 30;
//
//        Assert.assertEquals(expected,result);
//        System.out.println("T1");
//        System.out.println("CounterValue: "+counter);
//    }
//    @Test(timeout = 2000) //timeout = 2sec
//    public void sumAnyNumbers(){
//        for (int i=0; i<8; i++){
//            counter +=i; //36
//        }
//        Thread.sleep(3000);
//
//        int total = CalculatorService.sumAnyNumbers(1,2,3,4);
//        int expected = 10;
//
//        Assert.assertEquals(expected,total);
//        System.out.println("T2");
//        System.out.println("CounterValue: "+counter);
//    }
//    @AfterClass // after all test cases
//    public static void cleanUp(){
//
//        System.out.println("After all test cases is DONE: :)");
//        System.out.println("Test Cases are all done: "+ new Date());
//    }
//    @After
//    public void tp(){
//        System.out.println("##-- After each Test --##");
//
//    }
//
//}
////Annotations
////@before
////@beforeClass
////@after
////@afterClass
////@Test