package Stream;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user.txt")) {

            System.out.print("Name: ");
            fw.write("Name: " + br.readLine() + "\n");

            System.out.print("Age: ");
            fw.write("Age: " + br.readLine() + "\n");

            System.out.print("Favorite Language: ");
            fw.write("Language: " + br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

