package Level1_8_01_2026;

import java.util.Scanner;

public class LowerCaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "KHUSHI";
        String result1 = convertToLower(str);
        System.out.println(result1);
        String result2 = str.toLowerCase();
        System.out.println(result2);

        if(result1.equals(result2)){
            System.out.println("true");
            return;
        }
        else{
            System.out.println("false");
            return;
        }

    }

    static String convertToLower(String str) {
        String st = "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int val = (int) ch + 32;
            st += (char) val;

        }
        return st;
    }
}

//Problem 9

//Write a program to convert the complete text to uppercase and compare the results
//Hint =>
//Take user input using the  Scanner nextLine() method to take the complete text into a String variable
//Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
//Write a method to compare two strings using the charAt() method and return a boolean result
//In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result
