package Exception;

import java.io.*;
import java.util.List;

public class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
                e.printStackTrace();
            }
        }
    }
}

