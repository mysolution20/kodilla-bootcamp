package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList {
    final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>(Arrays.asList("Task No.1, done", "Task No.2, in progress", "Task No.3, to do"));
    }

    public String getTasksToDo() {
        return tasks.get(2);
    }

    public String getTasksInProgress() {
        return tasks.get(1);
    }

    public String getTasksDone() {
        return tasks.get(0);
    }
}
