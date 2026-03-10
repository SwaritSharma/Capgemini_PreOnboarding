package M1_Test;

import java.util.Scanner;

public class EncodedString {

    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(decode(str,str.length()));
    }

    private static String decode(String str, int n) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
            int j=i;
            while(j<n && str.charAt(j)=='1'){
                j++;
            }
            sb.append((char)(j-i-1+'A'));
            i=j+1;
        }
        return sb.toString();
    }
}
