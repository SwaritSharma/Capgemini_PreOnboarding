package CollectionFramework;

import java.time.LocalDate;
import java.util.*;

public class InsuranceManagementSet {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    public void displayAllUnique() {
        System.out.println("Unique Policies (HashSet):");
        hashSet.forEach(System.out::println);
    }

    public void displayExpiringSoon() {
        System.out.println("\nPolicies Expiring within 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusDays(30);
        treeSet.stream()
                .filter(p -> !p.getExpiryDate().isBefore(today) && p.getExpiryDate().isBefore(nextMonth))
                .forEach(System.out::println);
    }

    public void displayByCoverage(String type) {
        System.out.println("\nPolicies with Coverage: " + type);
        hashSet.stream()
                .filter(p -> p.getCoverageType().equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    public static List<Policy> findDuplicates(List<Policy> inputList) {
        Set<String> seen = new HashSet<>();
        List<Policy> duplicates = new ArrayList<>();
        for (Policy p : inputList) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p);
            }
        }
        return duplicates;
    }

    public void comparePerformance() {
        System.out.println("\n--- Performance Comparison (Adding 10,000 policies) ---");
        int count = 10000;
        List<Policy> bulkData = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            bulkData.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i % 365), "Health", 1000 + i));
        }

        long start = System.nanoTime();
        Set<Policy> h = new HashSet<>();
        for (Policy p : bulkData)
            h.add(p);
        long end = System.nanoTime();
        System.out.println("HashSet Add: " + (end - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        Set<Policy> l = new LinkedHashSet<>();
        for (Policy p : bulkData)
            l.add(p);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add: " + (end - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        Set<Policy> t = new TreeSet<>();
        for (Policy p : bulkData)
            t.add(p);
        end = System.nanoTime();
        System.out.println("TreeSet Add: " + (end - start) / 1000000.0 + " ms");
    }

    public static void main(String[] args) {
        InsuranceManagementSet manager = new InsuranceManagementSet();

        List<Policy> input = Arrays.asList(
                new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 500),
                new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 300),
                new Policy("P003", "Charlie", LocalDate.now().plusDays(5), "Health", 600),
                new Policy("P004", "David", LocalDate.now().plusDays(60), "Home", 450),
                new Policy("P001", "Alice Clone", LocalDate.now().plusDays(10), "Health", 500) // Duplicate
        );

        System.out.println("Initial data (with duplicate P001):");
        input.forEach(System.out::println);

        System.out.println("\nFinding duplicates in input list:");
        System.out.println(findDuplicates(input));

        for (Policy p : input) {
            manager.addPolicy(p);
        }

        manager.displayAllUnique();
        manager.displayExpiringSoon();
        manager.displayByCoverage("Health");
        manager.comparePerformance();
    }
}
