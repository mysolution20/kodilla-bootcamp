package com.kodilla.spring.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public String getToDoList() {
        return toDoList.getTasksToDo();
    }

    public String getInProgressList() {
        return inProgressList.getTasksInProgress();
    }

    public String getDoneList() {
        return doneList.getTasksDone();
    }
}
