package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isTaskDone;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
