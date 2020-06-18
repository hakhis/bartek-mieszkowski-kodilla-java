package com.kodilla.patterns.singleton;

import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("Event 1");
        //Then
        System.out.println(logger.getLastLog());
    }
}
