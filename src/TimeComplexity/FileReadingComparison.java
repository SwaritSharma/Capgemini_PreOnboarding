package TimeComplexity;

import java.io.*;

public class FileReadingComparison {
    public static void main(String[] args) throws IOException {
        String filename = "test_large.txt";
        // Create a dummy file for testing if it doesn't exist
        File file = new File(filename);
        if (!file.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 1000000; i++)
                writer.write("This is a test line.\n");
            writer.close();
        }

        long start = System.currentTimeMillis();
        try (FileReader fr = new FileReader(file)) {
            while (fr.read() != -1)
                ;
        }
        long end = System.currentTimeMillis();
        System.out.println("FileReader time: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file))) {
            while (isr.read() != -1)
                ;
        }
        end = System.currentTimeMillis();
        System.out.println("InputStreamReader time: " + (end - start) + "ms");

        // Optional: delete test file
        // file.delete();
    }
}
