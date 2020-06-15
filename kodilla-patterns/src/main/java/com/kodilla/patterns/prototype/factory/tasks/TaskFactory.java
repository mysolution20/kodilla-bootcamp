package com.kodilla.patterns.prototype.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Transfer goods by lorry.", "To Katowice", "MAN");
            case PAINTING:
                return new PaintingTask("Paint new fence for school.", "Brown, Green", "New school fence.");
            case SHOPPING:
                return new ShoppingTask("Buying paint and brushes.", "Paint, brushes", 50);
            default:
                return null;
        }
    }
}
