package Javaeight;

import java.util.*;
import java.util.stream.*;


public class RiskAssessmentApp {
    public static void main(String[] args) {

        List<PolicyHolder> holders = Arrays.asList(
                new PolicyHolder(1, "Ramesh", 65, "Life", 40000),
                new PolicyHolder(2, "Suresh", 70, "Life", 20000),
                new PolicyHolder(3, "Amit", 55, "Health", 30000)
        );

        Map<String, List<RiskAssessment>> grouped =
                holders.stream()
                        .filter(h -> h.policyType.equals("Life") && h.age > 60)
                        .map(h -> {
                            double score = h.premium / h.age;
                            String category = score > 0.5 ? "High Risk" : "Low Risk";
                            return new RiskAssessment(h.holderId, h.name, score, category);
                        })
                        .sorted((a, b) -> Double.compare(b.score, a.score))
                        .collect(Collectors.groupingBy(r -> r.category));

        System.out.println(grouped);
    }
}

