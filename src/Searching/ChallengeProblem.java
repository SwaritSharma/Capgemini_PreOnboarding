package Searching;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChallengeProblem {

    // ---------- StringBuilder vs StringBuffer ----------
    static void compareStrings(int times) {

        String word = "hello";

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(word);
        }
        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sbuf.append(word);
        }
        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("StringBuilder Time (ns): " + builderTime);
        System.out.println("StringBuffer  Time (ns): " + bufferTime);

        System.out.println("Winner: " + (builderTime < bufferTime ? "StringBuilder" : "StringBuffer"));
    }

    // ---------- FileReader ----------
    static long readUsingFileReader(String fileName) throws IOException {

        long start = System.nanoTime();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        long wordCount = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        br.close();
        long end = System.nanoTime();

        long timeTaken = end - start;

        System.out.println("FileReader Word Count: " + wordCount);
        System.out.println("FileReader Time (ns): " + timeTaken);

        return timeTaken;
    }

    // ---------- InputStreamReader ----------
    static long readUsingInputStreamReader(String fileName) throws IOException {

        long start = System.nanoTime();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName),
                        StandardCharsets.UTF_8
                )
        );

        String line;
        long wordCount = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        br.close();
        long end = System.nanoTime();

        long timeTaken = end - start;

        System.out.println("InputStreamReader Word Count: " + wordCount);
        System.out.println("InputStreamReader Time (ns): " + timeTaken);

        return timeTaken;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        while (t-- > 0) {

            System.out.println("NEW TEST CASE");

            System.out.println("Enter number of string concatenations:");
            int times = sc.nextInt();

            System.out.println("Enter file name to read:");
            String fileName = sc.next();

            // String comparison
            System.out.println("\nComparing StringBuilder vs StringBuffer");
            compareStrings(times);

            // File reading comparison
            System.out.println("\nReading file using FileReader");
            long fileReaderTime = readUsingFileReader(fileName);

            System.out.println("\nReading file using InputStreamReader");
            long inputStreamReaderTime = readUsingInputStreamReader(fileName);

            System.out.println("\nFile Reading Winner: " + (fileReaderTime < inputStreamReaderTime ? "FileReader" : "InputStreamReader"));
        }

        sc.close();
    }
}
