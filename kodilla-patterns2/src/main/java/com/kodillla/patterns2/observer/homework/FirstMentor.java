package com.kodillla.patterns2.observer.homework;

public class FirstMentor implements MentorObserver {
    private String mentorName;
    private int updateCount;

    public FirstMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Task task) {
        System.out.println("First mentor: task number: " + task.getTaskNumber() + " \n" +
                "has changed its status to: " + task.getTaskStatus());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
