package LinkedList.RoundRobinScheduling;
import LinkedList.Node;

public class RoundRobinScheduler {

    private Node<Process> head;
    private final int timeQuantum;
    private int currentTime;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    /* -------- ADD PROCESS -------- */

    public void addProcess(Process process) {
        Node<Process> newNode = new Node<>(process);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node<Process> temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    /* -------- REMOVE PROCESS -------- */

    private void removeProcess(Node<Process> prev, Node<Process> curr) {

        if (curr == head && curr.next == head) {
            head = null;
            return;
        }

        if (curr == head) {
            prev.next = head.next;
            head = head.next;
            return;
        }

        prev.next = curr.next;
    }

    /* -------- SCHEDULING -------- */

    public void execute() {

        if (head == null) return;

        Node<Process> curr = head;
        Node<Process> prev = null;

        while (head != null) {

            Process p = curr.data;

            int execTime = Math.min(timeQuantum, p.getRemainingTime());
            p.reduceTime(execTime);
            currentTime += execTime;

            // update waiting time for others
            Node<Process> temp = head;
            do {
                if (temp != curr) {
                    temp.data.addWaitingTime(execTime);
                }
                temp = temp.next;
            } while (temp != head);

            System.out.println(
                    "Executing " + p.getProcessId() +
                            " for " + execTime + " units"
            );

            if (p.getRemainingTime() == 0) {
                p.setTurnaroundTime(currentTime);
                System.out.println("Process " + p.getProcessId() + " finished");

                removeProcess(prev, curr);
                curr = (prev == null) ? head : prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }

            displayQueue();
        }
    }

    /* -------- DISPLAY -------- */

    public void displayQueue() {

        if (head == null) {
            System.out.println("Queue empty\n");
            return;
        }

        System.out.print("Queue: ");
        Node<Process> temp = head;
        do {
            System.out.print(
                    temp.data.getProcessId() +
                            "(" + temp.data.getRemainingTime() + ") "
            );
            temp = temp.next;
        } while (temp != head);

        System.out.println("\n");
    }

    /* -------- STATISTICS -------- */

    public void printAverageTimes(Process[] processes) {

        int totalWT = 0;
        int totalTAT = 0;

        for (Process p : processes) {
            totalWT += p.getWaitingTime();
            totalTAT += p.getTurnaroundTime();
        }

        System.out.println("Average Waiting Time = " +
                (double) totalWT / processes.length);

        System.out.println("Average Turnaround Time = " +
                (double) totalTAT / processes.length);
    }
}