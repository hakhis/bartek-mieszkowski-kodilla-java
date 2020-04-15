package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name = "Triangle";
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
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
