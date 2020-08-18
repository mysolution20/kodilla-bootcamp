package com.kodillla.patterns2.observer.homework;

public class TaskModuleTwo extends Task{
    public TaskModuleTwo(Long taskNumber, TaskStatus taskStatus) {
        super(2L, TaskStatus.SENT_FOR_APPROVAL);
    }
}
