package AssignmentCSV;

import java.io.*;
import java.util.*;

public class SortBySalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("resources/employees.csv"));
        List<String[]> list = new ArrayList<>();
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            list.add(line.split(","));
        }
        br.close();

        list.sort((a, b) -> Double.compare(
                Double.parseDouble(b[3]),
                Double.parseDouble(a[3])
        ));

        list.stream().limit(5).forEach(e ->
                System.out.println(e[1] + " - " + e[3])
        );
    }
}
