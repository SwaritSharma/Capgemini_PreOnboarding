package Searching;

import java.util.Scanner;

public class StringConcatComparison {

    public static String concatBuffer(String [] arr){
        StringBuffer sb=new StringBuffer();
        for(String str: arr){
            sb.append(str);
            if(!str.equals(arr[arr.length-1])){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static String concatBuilder(String [] arr){
        StringBuilder sb=new StringBuilder();
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
            long bufferSt=System.nanoTime();
            concatBuffer(arr);
            long bufferEnd=System.nanoTime();
            long bufferTime=bufferEnd-bufferSt;
            System.out.println("Time taken by StringBuffer : "+bufferTime);


            long builderSt=System.nanoTime();
            concatBuilder(arr);
            long builderEnd=System.nanoTime();
            long builderTime=builderEnd-builderSt;
            System.out.println("Time taken by StringBuilder : "+builderTime);
            System.out.println("Winner is : "+(builderTime<bufferTime?"StringBuilder "+builderTime:"StringBuffer "+bufferTime));
            t--;
        }
    }
}
