package com.kodilla.patterns.prototype.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "ShoppingTask has been executed.";
    }

    @Override
    public String getTaskName() {
        return "ShoppingTask";
    }

    @Override
    public Boolean isTaskExecuted() {
        return true;
    }
}
