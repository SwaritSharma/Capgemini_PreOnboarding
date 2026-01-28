package LinkedList.RoundRobinScheduling;

public class RoundRobinTest {

    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

        Process p1 = new Process("P1", 10, 1);
        Process p2 = new Process("P2", 5, 2);
        Process p3 = new Process("P3", 8, 1);
        Process[] allProcesses = {p1, p2, p3};

        scheduler.addProcess(p1);
        scheduler.addProcess(p2);
        scheduler.addProcess(p3);

        System.out.println("Starting Round Robin Scheduling:\n");
        scheduler.execute();

        System.out.println("Final Statistics:");
        scheduler.printAverageTimes(allProcesses);
    }
}
