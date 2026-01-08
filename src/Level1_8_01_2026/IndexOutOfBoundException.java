package Level1_8_01_2026;

import java.util.Scanner;

public class IndexOutOfBoundException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // generateException();
        handleException();
    }

    public static void generateException(String str){
        String name = "khushi";
        for(int i =0;i<=str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void handleException(){
        String name = "khushi";
        try{
            System.out.println(name.charAt(6));
        }
        catch(Exception e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }

}

//Problem 5

//Write a program to demonstrate StringIndexOutOfBoundsException
//Hint =>
//Define a variable of type String and take user input to assign a value
//Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
//Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
//From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
