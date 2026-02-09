package AssignmentCSV;

import java.io.*;

public class SearchEmployee {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("resources/employees.csv"));
        String search = "Neha";
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[1].equalsIgnoreCase(search)) {
                System.out.println("Department: " + d[2] + ", Salary: " + d[3]);
            }
        }
        br.close();
    }
}
