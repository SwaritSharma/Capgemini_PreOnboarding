package AssignmentCSV;

import java.io.*;
import java.util.*;

public class CSVToObject {
    public static void main(String[] args) throws Exception {
        List<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("resources/students.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            list.add(new Student(
                    Integer.parseInt(d[0]),
                    d[1],
                    Integer.parseInt(d[2]),
                    Integer.parseInt(d[3])
            ));
        }
        br.close();
        list.forEach(System.out::println);
    }
}
