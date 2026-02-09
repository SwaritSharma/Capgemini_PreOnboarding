package AssignmentCSV;

import java.io.*;

public class LargeCSVReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("resources/big.csv"));
        String line;
        int count = 0, batch = 0;

        while ((line = br.readLine()) != null) {
            batch++;
            count++;
            if (batch == 100) {
                System.out.println("Processed: " + count);
                batch = 0;
            }
        }
        br.close();
    }
}
