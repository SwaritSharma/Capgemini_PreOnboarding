package Searching;

import java.util.Scanner;

public class StringConcatenation {

    public static String concat(String [] arr){
        StringBuffer sb=new StringBuffer();
        for(String str: arr){
            sb.append(str);
            if(!str.equals(arr[arr.length-1])){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of test cases");
        int t=sc.nextInt();
        while(t>0) {
            System.out.println("Enter the length of array");
            int n=sc.nextInt();
            String[] arr =new String[n];
            int j=0;
            while(j<n){
                System.out.println("Enter the strings");
                arr[j++] = sc.next();
            }
            System.out.println("Concatenated String : " + concat(arr));
            t--;
        }
    }
}
