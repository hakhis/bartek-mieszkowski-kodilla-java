package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import com.kodilla.testing.collection.OddNumbersExterminator.*;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        System.out.println("Testing with empty array list");
        OddNumbersExterminator selector = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<Integer>();
        ArrayList<Integer> resultList = selector.exterminate(testList);
        ArrayList<Integer> desiredList = new ArrayList<Integer>();
        Assert.assertEquals(desiredList, resultList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        System.out.println("Testing with array list generated by \"for\" loop for 10 elements");
        OddNumbersExterminator selector = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            testList.add(i);
        }
        ArrayList<Integer> resultList = selector.exterminate(testList);
        ArrayList<Integer> desiredList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i+=2) {
            desiredList.add(i);
        }
        Assert.assertEquals(desiredList, resultList);
    }
}