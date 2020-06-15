package com.kodilla.patterns.prototype.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "PaintingTask has been executed.";
    }

    @Override
    public String getTaskName() {
        return "PaintingTask";
    }

    @Override
    public Boolean isTaskExecuted() {
        return true;
    }
}
