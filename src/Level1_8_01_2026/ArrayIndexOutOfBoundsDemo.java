package Level1_8_01_2026;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names) {
        // Accessing index larger than array length (no handling)
        System.out.println("Accessing invalid index:");
        System.out.println(names[names.length]); // Exception occurs here
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index inside try block:");
            System.out.println(names[names.length]); // Exception occurs here
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        try {
            generateException(names);
        }
        catch (Exception e) {
            System.out.println("Exception generated in generateException()");
        }

        handleException(names);

        sc.close();
    }
}

//Problem 8

//Write a program to demonstrate ArrayIndexOutOfBoundsException
//Hint =>
//Define a variable of array of names and take input from the user
//Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program.
//Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
//From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


