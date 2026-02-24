package Mock_M1;

import java.util.Scanner;

public class InterLeavedMerge {
    public static void merge(String s1,String s2){

        int n= Math.max(s1.length(), s2.length());
        int n1= Math.min(s1.length(), s2.length());
        String longer=s1.length()>s2.length()? s1:s2;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n1;i++){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        sb.append(longer.substring(n1,n));
        System.out.println(sb.toString());
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        merge(s1,s2);
    }
}
