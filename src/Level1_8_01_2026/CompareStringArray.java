package Level1_8_01_2026;

import java.util.*;

public class CompareStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] array1 = StringToArray(str);
        char[] array2 = str.toCharArray();

        for(int i =0;i<str.length();i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for(int i =0;i<str.length();i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        if(Arrays.equals(array1,array2)){
            System.out.println("true");
            return;
        }
        else{
            System.out.println("False");
            return;
        }

    }

    static char[] StringToArray(String str) {
        char[] temp = new char[str.length()];
        for(int i =0;i<str.length();i++){
            temp[i] = str.charAt(i);
        }
        return temp;
    }
}
//Problem 3

//Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
//Hint =>
//Take user input using the  Scanner next() method to take the text into a String variable
//Write a method to return the characters in a string without using the toCharArray()
//Write a method to compare two string arrays and return a boolean result
//In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
