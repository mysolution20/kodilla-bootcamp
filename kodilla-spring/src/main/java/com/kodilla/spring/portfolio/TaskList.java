package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList {
    final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>(Arrays.asList("Task No.1, done", "Task No.2, in progress", "Task No.3, to do"
                , "Task No.4, done", "Task No.5, in progress", "Task No.6, to do"));
    }

    public String getTasksToDo() {
        return tasks.stream()
                .filter(entry -> entry.contains("to do"))
                .collect(Collectors.joining(" and "));
    }

    public String getTasksInProgress() {
        return tasks.stream()
                .filter(entry -> entry.contains("progress"))
                .collect(Collectors.joining(" and "));
    }

    public String getTasksDone() {
        return tasks.stream()
                .filter(entry -> entry.contains("done"))
                .collect(Collectors.joining(" and "));
    }
}
