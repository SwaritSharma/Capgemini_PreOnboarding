package Javaeight;

import java.util.*;
import java.util.stream.*;

public class ClaimsAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("C1", "P101", 8000, "Approved"),
                new Claim("C2", "P101", 12000, "Approved"),
                new Claim("C3", "P102", 6000, "Approved"),
                new Claim("C4", "P103", 3000, "Rejected")
        );

        claims.stream()
                .filter(c -> c.status.equals("Approved") && c.claimAmount > 5000)
                .collect(Collectors.groupingBy(
                        c -> c.policyNumber,
                        Collectors.summarizingDouble(c -> c.claimAmount)
                ))
                .entrySet().stream()
                .sorted((a, b) -> Double.compare(
                        b.getValue().getSum(),
                        a.getValue().getSum()
                ))
                .limit(3)
                .forEach(e ->
                        System.out.println(
                                e.getKey() +
                                        " Total=" + e.getValue().getSum() +
                                        " Avg=" + e.getValue().getAverage()
                        )
                );
    }
}
