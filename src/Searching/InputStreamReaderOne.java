package Searching;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderOne {

    public static void main(String[] args) throws IOException {

        // 1. Read binary data (bytes) from file
        FileInputStream fis = new FileInputStream("data1.txt");

        // 2. Convert byte stream to character stream (UTF-8)
        InputStreamReader isr =
                new InputStreamReader(fis, StandardCharsets.UTF_8);

        // 3. Read characters efficiently
        BufferedReader br = new BufferedReader(isr);

        String line;

        // 4. Read line by line and print
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 5. Close the stream
        br.close();
    }
}
