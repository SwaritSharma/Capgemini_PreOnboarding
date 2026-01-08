package Level1_8_01_2026;

import java.util.Scanner;

public class SubstringOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        String result1 = substringUsingCharAt(str,start,end);
        String result2 = str.substring(start,end);

        System.out.println("using charAt: "+result1 );
        System.out.println("using BuildtIn Method: "+result2);
        if(result1.equals(result2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }

    static String substringUsingCharAt(String str,int start,int end) {
        String word = "";
        for(int i =start;i<end;i++){
            word+=str.charAt(i);
        }
        return word;


    }
}


// Problem 2

//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
//Hint =>
//Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
//Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
