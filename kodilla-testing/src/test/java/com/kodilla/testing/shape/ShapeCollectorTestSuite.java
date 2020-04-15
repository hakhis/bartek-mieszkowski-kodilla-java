package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of tests for ShapeCollector class");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure = new Square(10);
        //When
        shapeCollector.addFigure(figure);
        //Then
        Assert.assertEquals(figure, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure = new Square(10);
        //When
        boolean result = shapeCollector.removeFigure(figure);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure = new Square(10);
        shapeCollector.addFigure(figure);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(figure, result);

    }
/*
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure1 = new Square(10);
        Shape figure2 = new Circle(10);
        Shape figure3 = new Triangle(10, 10);
        shapeCollector.addFigure(figure1);
        shapeCollector.addFigure(figure2);
        shapeCollector.addFigure(figure3);
        ArrayList<Shape> expectedFigures = new ArrayList<Shape>();
        expectedFigures.add(figure1);
        expectedFigures.add(figure2);
        expectedFigures.add(figure3);
        //When
        ArrayList<Shape> resultFigures = shapeCollector.showFigures();
        //Then
        Assert.assertEquals(expectedFigures, resultFigures);
    }
*/
}
