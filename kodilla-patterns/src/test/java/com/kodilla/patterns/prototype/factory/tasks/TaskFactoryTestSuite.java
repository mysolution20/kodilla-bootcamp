package com.kodilla.patterns.prototype.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("DrivingTask has been executed.", drive.executeTask());
        Assert.assertEquals("DrivingTask", drive.getTaskName());
        Assert.assertEquals(true, drive.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paint = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("PaintingTask has been executed.", paint.executeTask());
        Assert.assertEquals("PaintingTask", paint.getTaskName());
        Assert.assertEquals(true, paint.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("ShoppingTask has been executed.", shopping.executeTask());
        Assert.assertEquals("ShoppingTask", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
}