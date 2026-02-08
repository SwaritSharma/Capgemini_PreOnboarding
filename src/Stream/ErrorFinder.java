package Stream;
import java.io.*;

public class ErrorFinder {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("resources/large.log"));
        String line;

        while ((line = br.readLine()) != null) {
            if (line.toLowerCase().contains("error"))
                System.out.println(line);
        }
        br.close();
    }
}

