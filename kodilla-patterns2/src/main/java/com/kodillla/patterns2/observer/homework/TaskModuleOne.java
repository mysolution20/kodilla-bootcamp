package com.kodillla.patterns2.observer.homework;

public class TaskModuleOne extends Task {
    public TaskModuleOne(Long taskNumber, TaskStatus taskStatus) {
        super(1L, TaskStatus.SENT_FOR_APPROVAL);
    }
}
