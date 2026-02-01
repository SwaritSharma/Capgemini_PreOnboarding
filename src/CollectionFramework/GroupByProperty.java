package CollectionFramework;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByProperty {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
        new Employee("Alice", "HR"),
        new Employee("Bob", "IT"),
        new Employee("Carol", "HR"),
        new Employee("David", "IT"),
        new Employee("Eve", "Finance"));

        Map<String, List<Employee>> grouped = employees.stream().collect(Collectors.groupingBy(e -> e.department));

        System.out.println("Employees grouped by department:");
        grouped.forEach((dept, list) -> System.out.println(dept + ": " + list));
    }
}
