package CollectionFramework;

import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity; // Higher value = higher priority

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        // Higher severity first
        return Integer.compare(other.severity, this.severity);
    }

    @Override
    public String toString() {
        return name + " (" + severity + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> triage = new PriorityQueue<>();
        triage.add(new Patient("John", 3));
        triage.add(new Patient("Alice", 5));
        triage.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");
        while (!triage.isEmpty()) {
            System.out.println(triage.poll());
        }
    }
}
