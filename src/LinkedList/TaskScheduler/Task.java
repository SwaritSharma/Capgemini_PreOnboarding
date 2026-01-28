package LinkedList.TaskScheduler;

import java.time.LocalDate;

public class Task {

    private final String taskId;
    private final String taskName;
    private int priority;
    private LocalDate dueDate;

    public Task(String taskId, String taskName, int priority, LocalDate dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}

