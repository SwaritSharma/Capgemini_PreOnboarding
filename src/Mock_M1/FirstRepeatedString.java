package Mock_M1;

import java.util.Scanner;

public class FirstRepeatedString {
    public static void check(String arr[]){
        for(int i=0;i<arr.length-1;i++){
            String str=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(str.equals(arr[j])){
                    System.out.println(str);
                    return;
                }
            }
        }
        System.out.println("No repeated");
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        check(arr);
    }
}
