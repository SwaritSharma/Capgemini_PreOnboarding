package Level1_8_01_2026;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String str1 = sc.nextLine();
       String str2 = sc.nextLine();

        boolean customResult = compareTo(str1,str2);
        boolean equalsResult = str1.equals(str2);
        System.out.println("Using charAt(): " + customResult);
        System.out.println("Using equals(): " + equalsResult);

        System.out.println("Results match: " + (customResult == equalsResult));

    }
    static boolean compareTo(String s1 ,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        for(int i =0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

//Problem 1

//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
//Hint =>
//Take user input using the  Scanner next() method for 2 String variables
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String Built-In method to check if the results are the same and display the result

