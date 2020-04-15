package com.kodilla.testing.shape;

public class Circle implements  Shape {
    private String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return 0;
    }
}
