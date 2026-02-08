package Javaeight;

import java.util.*;
import java.util.stream.*;

public class InsuranceApp {
    public static void main(String[] args) {

        List<Policy> policies = Arrays.asList(
                new Policy("P101", "John Smith", 1500),
                new Policy("P102", "Aman Verma", 900),
                new Policy("P103", "Neha Singh", 2200),
                new Policy("P104", "Smith Roy", 1800)
        );

        // 1 Filter > 1200
        policies.stream().filter(p -> p.premium > 1200).forEach(p -> System.out.println(p.policyNo));

        // 2 Sort by holder name
        policies.stream()
                .sorted((a,b) -> a.holder.compareTo(b.holder))
                .forEach(p -> System.out.println(p.holder));

        // 3 Total premium
        double total = policies.stream().mapToDouble(p -> p.premium).sum();
        System.out.println("Total = " + total);

        // 4 Print details
        policies.forEach(p ->
                System.out.println(p.policyNo + " " + p.holder + " " + p.premium));

        // 5 Premium range
        policies.stream()
                .filter(p -> p.premium >= 1000 && p.premium <= 2000)
                .forEach(p -> System.out.println(p.policyNo));

        // 6 Highest premium
        policies.stream()
                .max(Comparator.comparingDouble(p -> p.premium))
                .ifPresent(p -> System.out.println("Highest = " + p.premium));

        // 7 Group by initial
        Map<Character, List<Policy>> map =
                policies.stream()
                        .collect(Collectors.groupingBy(p -> p.holder.charAt(0)));
        System.out.println(map);

        // 8 Average premium
        System.out.println(policies.stream()
                .mapToDouble(p -> p.premium)
                .average().orElse(0));

        // 9 Sort by premium
        policies.stream()
                .sorted(Comparator.comparingDouble(p -> p.premium))
                .forEach(p -> System.out.println(p.premium));

        // 10 Any > 2000
        System.out.println(policies.stream().anyMatch(p -> p.premium > 2000));

        // 11 Count ranges
        long low = policies.stream().filter(p -> p.premium <= 1000).count();
        long mid = policies.stream().filter(p -> p.premium > 1000 && p.premium <= 2000).count();
        long high = policies.stream().filter(p -> p.premium > 2000).count();

        System.out.println(low + " " + mid + " " + high);

        // 12 Unique holders
        policies.stream().map(p -> p.holder).distinct().forEach(System.out::println);

        // 13 Name contains Smith
        policies.stream().filter(p -> p.holder.contains("Smith")).forEach(p -> System.out.println(p.policyNo));

        // 14 Map policyNo → premium
        Map<String, Double> policyMap =
                policies.stream().collect(Collectors.toMap(p -> p.policyNo, p -> p.premium));
        System.out.println(policyMap);
    }
}
