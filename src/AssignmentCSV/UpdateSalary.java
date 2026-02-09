package AssignmentCSV;

import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("resources/employees.csv"));
        FileWriter fw = new FileWriter("updated_employees.csv");

        String line = br.readLine();
        fw.write(line + "\n");

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[2].equalsIgnoreCase("IT")) {
                double salary = Double.parseDouble(d[3]);
                d[3] = String.valueOf(salary * 1.10);
            }
            fw.write(String.join(",", d) + "\n");
        }
        br.close();
        fw.close();
    }
}
