package Stream;

import java.io.*;

public class FileCopySimple {
    public static void main(String[] args) {
        File src = new File("resources/Source.txt");
        File dest = new File("destination.txt");

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

