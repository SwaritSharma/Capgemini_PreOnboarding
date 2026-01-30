package Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamReaderTwo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        FileWriter fw = new FileWriter("IntputStreamReaderTwo.txt");

        System.out.println("Enter text (type 'exit' to stop):");

        String line;

        while (true) {

            line = br.readLine();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            fw.write(line);
            fw.write("\n");
        }

        fw.close();
        br.close();

        System.out.println("Input saved to file successfully.");
    }
}
