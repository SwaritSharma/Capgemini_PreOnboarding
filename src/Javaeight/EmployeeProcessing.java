package Javaeight;

import java.util.*;
import java.util.stream.*;


public class EmployeeProcessing {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", "Engineering", 90000),
                new Employee(2, "Neha", "Engineering", 85000),
                new Employee(3, "Ravi", "HR", 70000),
                new Employee(4, "John", "Engineering", 75000)
        );

        Map<String, Double> result =
                employees.stream()
                        .filter(e -> e.department.equals("Engineering") && e.salary > 80000)
                        .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.averagingDouble(e -> e.salary)
                        ));

        System.out.println(result);
    }
}
