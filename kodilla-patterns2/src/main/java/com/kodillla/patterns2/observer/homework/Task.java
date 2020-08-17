package com.kodillla.patterns2.observer.homework;

import java.util.HashSet;
import java.util.Set;

public class Task implements StudentsTasksObservable {
    private Long taskNumber;
    private TaskStatus taskStatus;
    private Set<MentorObserver> registeredMentorObservers = new HashSet<>();

    public Task(Long taskNumber, TaskStatus taskStatus) {
        this.taskNumber = taskNumber;
        this.taskStatus = taskStatus;
    }

    @Override
    public void registerMentorObserver(MentorObserver mentorObserver) {
        registeredMentorObservers.add(mentorObserver);
    }

    @Override
    public void removeMentorObserver(MentorObserver mentorObserver) {
        registeredMentorObservers.remove(mentorObserver);
    }

    @Override
    public void notifyMentorObservers() {
        for (MentorObserver mentorObserver : registeredMentorObservers) {
            mentorObserver.update(this);      //  object (Task task) --> .update(this)
        }
    }

    public void changeTaskStatus(TaskStatus taskStatus) {
        setTaskStatus(taskStatus);
        notifyMentorObservers();
    }

    public Long getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(Long taskNumber) {
        this.taskNumber = taskNumber;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Set<MentorObserver> getRegisteredMentorObservers() {
        return registeredMentorObservers;
    }
}
