package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Christmas shopping", "Cake", 2);
            case PAINTING:
                return new PaintingTask("Door painting", "Blue", "Front door");
            case DRIVING:
                return new DrivingTask("Drive to grandma", "Warsaw", "Bicycle");
            default:
                return null;
        }
    }
}
