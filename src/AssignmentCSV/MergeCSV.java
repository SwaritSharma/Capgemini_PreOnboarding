package AssignmentCSV;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws Exception {
        Map<String, String[]> map = new HashMap<>();

        BufferedReader br1 = new BufferedReader(new FileReader("resources/students1.csv"));
        br1.readLine();
        String line;

        while ((line = br1.readLine()) != null) {
            map.put(line.split(",")[0], line.split(","));
        }
        br1.close();

        BufferedReader br2 = new BufferedReader(new FileReader("resources/students2.csv"));
        FileWriter fw = new FileWriter("merged.csv");
        fw.write("ID,Name,Age,Marks,Grade\n");
        br2.readLine();

        while ((line = br2.readLine()) != null) {
            String[] d = line.split(",");
            String[] s1 = map.get(d[0]);
            if (s1 != null) {
                fw.write(s1[0] + "," + s1[1] + "," + s1[2] + "," + d[1] + "," + d[2] + "\n");
            }
        }
        br2.close();
        fw.close();
    }
}
