package AssignmentCSV;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {
        Pattern email = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Pattern phone = Pattern.compile("\\d{10}");

        BufferedReader br = new BufferedReader(new FileReader("resources/users.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (!email.matcher(d[2]).matches() || !phone.matcher(d[3]).matches()) {
                System.out.println("Invalid Row: " + line);
            }
        }
        br.close();
    }
}
