package Searching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTwo {

    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println("Enter Target Word");
        String targetWord = sc.next();   // jis word ko count karna hai
        int count = 0;

        String line;

        while ((line = br.readLine()) != null) {

            String[] words = line.split(" ");

            for (String word : words) {
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }
        }

        br.close();

        System.out.println("Word '" + targetWord + "' occurs " + count + " times.");
    }
}
