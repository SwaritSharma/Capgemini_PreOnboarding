package LinkedList.RoundRobinScheduling;

public class Process {

    private final String processId;
    private final int priority;
    private final int burstTime;
    private int remainingTime;
    private int waitingTime;
    private int turnaroundTime;

    public Process(String processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }

    public String getProcessId() {
        return processId;
    }

    public int getPriority() {
        return priority;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void reduceTime(int time) {
        remainingTime -= time;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void addWaitingTime(int time) {
        waitingTime += time;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int time) {
        turnaroundTime = time;
    }
}

