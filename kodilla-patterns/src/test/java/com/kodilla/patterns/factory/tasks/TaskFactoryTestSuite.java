package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals(shoppingTask.isTaskExecuted(), false);
        Assert.assertEquals(shoppingTask.getTaskName(), "Christmas shopping");
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();

        //Then
        Assert.assertEquals(paintingTask.isTaskExecuted(), true);
        Assert.assertEquals(paintingTask.getTaskName(), "Door painting");
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();

        //Then
        Assert.assertEquals(drivingTask.isTaskExecuted(), true);
        Assert.assertEquals(drivingTask.getTaskName(), "Drive to grandma");
    }
}
