package com.kodilla.springe.portfolio;

public class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList(String task1) {
        toDoList.getTasks().add(task1);
        return toDoList;
    }

    public TaskList getInProgressList(String task2) {
        inProgressList.getTasks().add(task2);
        return inProgressList;
    }

    public TaskList getDoneList(String task3) {
        doneList.getTasks().add(task3);
        return doneList;
    }

}
