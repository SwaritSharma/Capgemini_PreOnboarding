package CollectionFramework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class InsuranceManagementMap {
    private Map<String, Policy> hashMap = new HashMap<>();
    private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private Map<Policy, String> policySortedByDate = new TreeMap<>();

    public void addPolicy(Policy p) {
        hashMap.put(p.getPolicyNumber(), p);
        linkedHashMap.put(p.getPolicyNumber(), p);
        policySortedByDate.put(p, p.getPolicyNumber());
    }

    public Policy getByNumber(String num) {
        return hashMap.get(num);
    }

    public List<Policy> getExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusDays(30);
        return hashMap.values().stream()
                .filter(p -> !p.getExpiryDate().isBefore(today) && p.getExpiryDate().isBefore(nextMonth))
                .collect(Collectors.toList());
    }

    public List<Policy> getByHolder(String name) {
        return hashMap.values().stream()
                .filter(p -> p.getHolderName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public void removeExpired() {
        LocalDate today = LocalDate.now();
        hashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));
        linkedHashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));
        policySortedByDate.keySet().removeIf(p -> p.getExpiryDate().isBefore(today));
    }

    public static void main(String[] args) {
        InsuranceManagementMap manager = new InsuranceManagementMap();

        Policy p1 = new Policy("P001", "Happy", LocalDate.now().plusDays(10), "Health", 500);
        Policy p2 = new Policy("P002", "Krish", LocalDate.now().minusDays(5), "Auto", 300);
        Policy p3 = new Policy("P003", "Sita", LocalDate.now().plusDays(40), "Home", 700);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);

        System.out.println("Policy P001: " + manager.getByNumber("P001"));
        System.out.println("Expiring soon: " + manager.getExpiringSoon());
        System.out.println("Policies for Sita: " + manager.getByHolder("Sita"));

        System.out.println("\nRemoving expired policies");
        manager.removeExpired();
        System.out.println("After removal, P002 should be gone: " + manager.getByNumber("P002"));
    }
}
