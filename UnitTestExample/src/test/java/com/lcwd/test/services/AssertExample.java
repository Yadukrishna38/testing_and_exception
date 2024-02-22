package com.lcwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.List;

public class AssertExample {

    //Validating Expected and actual result are same or not..
    //Assertions Class : Static methods only and overlaoded methods

    @Test
    public void test1(){
    System.out.println("Testing some Assertions Methods");

//    int exp = 10; // We can use any datatype for both
//    float act = 10F; // We can use any datatype for both
//
//    Assertions.assertEquals(exp,act);

//    int[] expArr = {1,2,3,4};
//    int[] actArr = {1,2,3,4};
//
//    Assertions.assertArrayEquals(expArr,actArr);

//        String name = new String("yadu");
//        String exp_name = new String("yadu");
//
//        Assertions.assertSame(exp_name,name); // to check that obj refers same id?

//        to check boolean true or false
        boolean value = true;
        Assertions.assertTrue(value);

////        TO check the order of nos:
//        List<Integer> l1 = Arrays.asList(1,2,3,4);
//        List<Integer> l2 = Arrays.asList(1,2,4,3);
//
//        Assertions.assertIterableEquals(l1,l2);

//        throw an exception and check specific exception and test passes
        Assertions.assertThrows(RuntimeException.class,() ->{
//            throw new RuntimeException("this is a exception");
            System.out.println("this is executable block: ");
        });






    }
}
