package Mock_M1;

import java.util.Scanner;

public class ReverseEvenPosString {
    public static void reverse(String str){
        String arr[]=str.split(" ");
        int n=arr.length;
        for(int i=1;i<n;i+=2){
            String s=arr[i];
            int end=arr[i].length()-1;
            String s1="";
            while(end>=0){
                s1+=arr[i].charAt(end--);
            }
            arr[i]=s1;
        }
        String res="";
        for(int i=0;i<n;i++){
            res+=arr[i];
            if(i!=n-1)res+=" ";
        }
        System.out.println(res);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        reverse(str);
    }
}
