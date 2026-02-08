package Stream;
import java.io.*;

public class CaseConverter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("resources/input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line.toLowerCase());
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

