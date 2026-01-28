package LinkedList.TaskScheduler;

import java.time.LocalDate;

public class TaskSchedulerTest {

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtEnd(new Task("T1", "Coding", 1,
                LocalDate.of(2026, 2, 10)));

        scheduler.addAtEnd(new Task("T2", "Testing", 2,
                LocalDate.of(2026, 2, 12)));

        scheduler.addAtBeginning(new Task("T3", "Design", 1,
                LocalDate.of(2026, 2, 8)));

        scheduler.addAtPosition(2, new Task("T4", "Review", 3,
                LocalDate.of(2026, 2, 11)));

        System.out.println("All Tasks:");
        scheduler.displayTasks();

        System.out.println("\nTotal Tasks: " + scheduler.getLength());

        System.out.println("\nCurrent Task:");
        System.out.println(scheduler.getCurrentTask().getTaskName());

        scheduler.moveToNextTask();
        System.out.println("After moving to next:");
        System.out.println(scheduler.getCurrentTask().getTaskName());

        System.out.println("\nTasks with Priority 1:");
        scheduler.searchByPriority(1);

        scheduler.removeByTaskId("T2");

        System.out.println("\nAfter removing T2:");
        scheduler.displayTasks();
    }
}
