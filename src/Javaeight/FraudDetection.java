package Javaeight;

import java.util.*;
import java.util.stream.*;



public class FraudDetection {
    public static void main(String[] args) {

        List<Transaction> txns = Arrays.asList(
                new Transaction("T1", "P1", 15000, true),
                new Transaction("T2", "P1", 20000, true),
                new Transaction("T3", "P1", 18000, true),
                new Transaction("T4", "P1", 12000, true),
                new Transaction("T5", "P1", 16000, true),
                new Transaction("T6", "P1", 17000, true),
                new Transaction("T7", "P2", 9000, true)
        );

        txns.stream()
                .filter(t -> t.isFraudulent && t.amount > 10000)
                .collect(Collectors.groupingBy(
                        t -> t.policyNumber,
                        Collectors.summarizingDouble(t -> t.amount)
                ))
                .forEach((policy, stats) -> {
                    if (stats.getCount() > 5 || stats.getSum() > 50000) {
                        System.out.println(
                                "ALERT: " + policy +
                                        " Count=" + stats.getCount() +
                                        " Amount=" + stats.getSum()
                        );
                    }
                });
    }
}

