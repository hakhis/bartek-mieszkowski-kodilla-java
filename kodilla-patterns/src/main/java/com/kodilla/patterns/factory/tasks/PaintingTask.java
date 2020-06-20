package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isTaskDone;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
