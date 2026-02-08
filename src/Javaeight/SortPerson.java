package Javaeight;
import java.util.*;

public class SortPerson {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rahul", 25, 50000),
                new Person("Aman", 22, 40000),
                new Person("Neha", 28, 70000)
        );

        people.sort((p1, p2) -> p1.age - p2.age);

        people.forEach(p -> System.out.println(p.name + " " + p.age));
    }
}

