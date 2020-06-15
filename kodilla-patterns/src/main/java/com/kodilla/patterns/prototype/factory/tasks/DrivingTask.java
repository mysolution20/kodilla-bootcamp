package com.kodilla.patterns.prototype.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "DrivingTask has been executed.";
    }

    @Override
    public String getTaskName() {
        return "DrivingTask";
    }

    @Override
    public Boolean isTaskExecuted() {
        return true;
    }
}
