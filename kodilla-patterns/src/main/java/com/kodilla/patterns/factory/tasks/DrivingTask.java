package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean isTaskDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isTaskDone = false;
    }

    @Override
    public void executeTask() {
        if (isTaskDone) {
            System.out.println("Task " + taskName + " is already done!");
        } else {
            System.out.println("Task " + taskName + " has been executed");
            isTaskDone = true;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskDone;
    }
}
