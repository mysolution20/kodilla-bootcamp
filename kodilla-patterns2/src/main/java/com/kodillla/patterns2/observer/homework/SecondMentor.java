package com.kodillla.patterns2.observer.homework;

public class SecondMentor implements MentorObserver {
    @Override
    public void update(Task task) {
        System.out.println("Second mentor: task number: " + task.getTaskNumber() + " \n" +
                "has changed its status to: " + task.getTaskStatus());
    }
}
