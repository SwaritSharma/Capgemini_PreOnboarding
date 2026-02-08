package Stream;

import java.io.*;

import java.util.*;

public class EmployeeSerialization {
    public static void main(String[] args) throws Exception {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Aman", "IT", 60000));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"));
        List<Employee> readList = (List<Employee>) ois.readObject();

        for (Employee e : readList) {
            System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
        }
        ois.close();
    }
}
