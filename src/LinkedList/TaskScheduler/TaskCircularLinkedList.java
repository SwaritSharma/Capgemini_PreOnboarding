package LinkedList.TaskScheduler;

import LinkedList.Node;

public class TaskCircularLinkedList {

    private Node<Task> head;

    public void addAtBeginning(Task task) {
        Node<Task> newNode = new Node<>(task);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node<Task> temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public void addAtEnd(Task task) {
        Node<Task> newNode = new Node<>(task);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node<Task> temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public void addAtPosition(int pos, Task task) {

        if (pos <= 0) return;

        if (pos == 1) {
            addAtBeginning(task);
            return;
        }

        Node<Task> temp = head;
        int count = 1;

        while (temp.next != head && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        Node<Task> newNode = new Node<>(task);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByTaskId(String taskId) {

        if (head == null) return;

        if (head.next == head && head.data.getTaskId().equals(taskId)) {
            head = null;
            return;
        }

        if (head.data.getTaskId().equals(taskId)) {
            Node<Task> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return;
        }

        Node<Task> curr = head;
        while (curr.next != head) {
            if (curr.next.data.getTaskId().equals(taskId)) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    public Task getCurrentTask() {
        if (head == null) return null;
        return head.data;
    }

    public void moveToNextTask() {
        if (head != null) {
            head = head.next;
        }
    }

    public void searchByPriority(int priority) {

        if (head == null) return;

        Node<Task> temp = head;
        do {
            if (temp.data.getPriority() == priority) {
                printTask(temp.data);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void displayTasks() {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node<Task> temp = head;
        do {
            printTask(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public int getLength() {

        if (head == null) return 0;

        int count = 1;
        Node<Task> temp = head.next;

        while (temp != head) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    private void printTask(Task t) {
        System.out.println(
                "TaskId=" + t.getTaskId() +
                        ", Name=" + t.getTaskName() +
                        ", Priority=" + t.getPriority() +
                        ", DueDate=" + t.getDueDate()
        );
    }
}
