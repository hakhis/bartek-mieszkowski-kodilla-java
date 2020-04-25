package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int n = 10;
        int[] arrayOfNumbers = new int[10];
        for (int i = 0; i < n; i++) {
            arrayOfNumbers[i] = (i + 1) * 100;
        }
        //average calculation
        double calculatedAverage = 0;
        for (int i = 0; i < n; i++) {
            calculatedAverage += arrayOfNumbers[i];
        }
        calculatedAverage = calculatedAverage / 10;

        //When
        double streamAverage = ArrayOperations.getAverage(arrayOfNumbers);

        //Then
        Assert.assertEquals(calculatedAverage, streamAverage, 0.001);
    }
}
